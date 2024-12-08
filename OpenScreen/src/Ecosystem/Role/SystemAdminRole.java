/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecosystem.Role;

import Ecosystem.OpenScreenSystem;
import Ecosystem.Organization.Organization;
import Ecosystem.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.SystemAdmin.SystemAdminWorkAreaJPanel;

/**
 *
 * @author admin
 */
public class SystemAdminRole extends Role{

    public SystemAdminRole() {
        this.type = RoleType.SystemAdmin;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, OpenScreenSystem system) {
        
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
}
