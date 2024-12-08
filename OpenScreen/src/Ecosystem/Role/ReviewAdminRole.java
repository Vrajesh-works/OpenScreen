/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecosystem.Role;

import Ecosystem.OpenScreenSystem;
import Ecosystem.Organization.Organization;
import Ecosystem.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.ReviewAdmin.ReviewAdminWorkAreaJPanel;

/**
 *
 * @author admin
 */
public class ReviewAdminRole extends Role{

    public ReviewAdminRole() {
        this.type = RoleType.ReviewAdmin;
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, OpenScreenSystem system) {
        
        return new ReviewAdminWorkAreaJPanel(userProcessContainer, account, system);
    }
}
