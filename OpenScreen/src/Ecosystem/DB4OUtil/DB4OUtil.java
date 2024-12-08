package Ecosystem.DB4OUtil;

import Ecosystem.ConfigureSystem;
import Ecosystem.OpenScreenSystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ext.DatabaseFileLockedException;
import com.db4o.ta.TransparentPersistenceSupport;

import java.nio.file.Paths;

/**
 * @author admin
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString(); // Path to the data store
    private static DB4OUtil dB4OUtil;

    /**
     * Singleton instance of DB4OUtil.
     * @return DB4OUtil instance
     */
    public synchronized static DB4OUtil getInstance() {
        if (dB4OUtil == null) {
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    /**
     * Safely shuts down the database connection.
     * @param conn the ObjectContainer connection
     */
    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null && !conn.ext().isClosed()) {
            conn.close();
        }
    }

    /**
     * Creates a connection to the database.
     * @return ObjectContainer connection or null in case of failure
     */
    private ObjectContainer createConnection() {
        ObjectContainer db = null;
        try {
            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            config.common().activationDepth(Integer.MAX_VALUE);
            config.common().updateDepth(Integer.MAX_VALUE);

            config.common().objectClass(OpenScreenSystem.class).cascadeOnUpdate(true);

            System.out.println("Attempting to connect to the database at: " + FILENAME);
            db = Db4oEmbedded.openFile(config, FILENAME);
            System.out.println("Database connection established successfully.");
        } catch (DatabaseFileLockedException e) {
            System.err.println("Error: The database file is locked and in use by another process. Please close other instances and try again.");
            e.printStackTrace();
        } catch (Exception ex) {
            System.err.println("Failed to create a connection: " + ex.getMessage());
            ex.printStackTrace();
        }
        return db;
    }


    public synchronized void storeSystem(OpenScreenSystem system) {
        ObjectContainer conn = null;
        try {
            conn = createConnection();
            if (conn != null) {
                conn.store(system);
                conn.commit();
                System.out.println("System stored successfully.");
            } else {
                throw new RuntimeException("Database connection is null. Cannot store system.");
            }
        } catch (Exception ex) {
            System.err.println("Error storing system: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            shutdown(conn);
        }
    }

    public OpenScreenSystem retrieveSystem() {
        ObjectContainer conn = null;
        OpenScreenSystem system = null;
        try {
            conn = createConnection();
            if (conn != null) {
                ObjectSet<OpenScreenSystem> systems = conn.query(OpenScreenSystem.class);
                if (systems.size() == 0) {
                    System.out.println("No existing system found. Creating a new one...");
                    system = ConfigureSystem.configure(); // Create a new system if none exists
                } else {
                    system = systems.get(systems.size() - 1); // Get the most recent system
                    System.out.println("System retrieved successfully.");
                }
            } else {
                throw new RuntimeException("Database connection is null. Cannot retrieve system.");
            }
        } catch (Exception ex) {
            System.err.println("Error retrieving system: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            shutdown(conn);
        }
        return system;
    }
}
