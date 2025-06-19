# OpenScreen - Cinema Management System

## Project Overview
OpenScreen is a comprehensive cinema management system developed as a final project for INFO5100 - Application Engineer & Dev course. The application facilitates the management of movie production, cinema operations, ticket booking, and review processes within a unified ecosystem.

## System Architecture
The system follows a multi-layered enterprise architecture with the following components:

### Enterprises
- **CinemaEnterprise**: Manages cinema operations, screenings, and ticket sales
- **CustomerEnterprise**: Handles customer accounts and ticket purchases
- **FilmEnterprise**: Manages movie production processes
- **ReviewEnterprise**: Handles movie review and audit processes
- **SystemAdminEnterprise**: System administration and management

### Organizations
Each enterprise consists of specialized organizations that handle specific functions:
- **Cinema**: CinemaEmployeeOrganization, CinemaManagerOrganization
- **Customer**: CustomerOrganization
- **Film**: FilmAdminOrganization, FilmDirectorOrganization, FilmScriptwriterOrganization, FilmShootOrganization
- **Review**: ReviewAdminOrganization, ReviewAuditorOrganization
- **SystemAdmin**: SystemAdminOrganization

### Core Features
1. **Movie Production Management**
   - Creation of new movie projects
   - Assignment of directors, scriptwriters, and cameramen
   - Movie production workflow management

2. **Cinema Management**
   - Room and seat management
   - Movie screening scheduling
   - Ticket price configuration

3. **Customer Interface**
   - Movie browsing and information
   - Ticket booking and purchasing
   - Order history tracking

4. **Review System**
   - Movie auditing and review
   - Quality assurance process

## Technology Stack
- **Java Swing**: UI components and application interface
- **DB4O**: Object-oriented database for data persistence
- **FlatLaf**: Modern UI look and feel
- **JFreeChart**: Data visualization capabilities

## Getting Started
1. Clone the repository
2. Open the project in your preferred Java IDE (NetBeans recommended)
3. Ensure the following libraries are in your classpath:
   - db4o-8.0.184.15484-all-java5.jar
   - flatlaf-1.6.5.jar
   - flatlaf-extras-1.6.5.jar
   - flatlaf-intellij-themes-1.6.5.jar
   - jcommon-1.0.23.jar
   - jfreechart-1.0.18.jar
4. Run MainJFrame as the main entry point

## Default System Admin Credentials
- Username: `sysadmin`
- Password: `sysadmin`

## System Workflow
1. System admin creates enterprises and organization admins
2. Film admins initiate movie projects and assign production teams
3. Production team completes the movie creation process
4. Cinema admins add movies to their library and schedule screenings
5. Customers browse movies, book tickets and make purchases
6. Review admins and auditors ensure quality control

## Database
The system uses DB4O object-oriented database for persistent data storage. All data is stored in `Databank.db4o` file.

## License
This project uses several open-source libraries:
- DB4O is licensed under GPL v2
- FlatLaf and JFreeChart under their respective licenses
