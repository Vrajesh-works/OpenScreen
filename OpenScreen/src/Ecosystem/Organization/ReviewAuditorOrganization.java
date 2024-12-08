/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecosystem.Organization;


import Ecosystem.Role.ReviewAuditorRole;
import Ecosystem.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ReviewAuditorOrganization extends Organization {

    public ReviewAuditorOrganization() {
        super(Organization.Type.ReviewAuditor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ReviewAuditorRole());
        return roles;
    }
}
