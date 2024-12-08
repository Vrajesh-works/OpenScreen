/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecosystem.Organization;

import Ecosystem.Role.FilmDirectorRole;
import Ecosystem.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class FilmDirectorOrganization extends Organization{
    public FilmDirectorOrganization() {
        super(Organization.Type.FilmDirector.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FilmDirectorRole());
        return roles;
    }
}
