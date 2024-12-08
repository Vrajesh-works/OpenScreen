/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecosystem.Role;

import Ecosystem.OpenScreenSystem;
import Ecosystem.Organization.Organization;
import Ecosystem.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.FilmDirector.FilmDirectorWorkAreaJPanel;

/**
 *
 * @author admin
 */
public class FilmDirectorRole extends Role{

    public FilmDirectorRole() {
        this.type = RoleType.FilmDirector;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, OpenScreenSystem system) {
        
        return new FilmDirectorWorkAreaJPanel(userProcessContainer, account, system);
    }
}
