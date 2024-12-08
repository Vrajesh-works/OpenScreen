/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecosystem.Organization;

import Ecosystem.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.CinemaEmployee.getValue())){
            organization = new CinemaEmployeeOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CinemaManager.getValue())){
            organization = new CinemaManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.FilmAdmin.getValue())) {
            organization = new FilmAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.FilmDirector.getValue())) {
            organization = new FilmDirectorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.FilmScriptwriter.getValue())) {
            organization = new FilmScriptwriterOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.FilmShoot.getValue())) {
            organization = new FilmShootOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.ReviewAuditor.getValue())) {
            organization = new ReviewAuditorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.SystemAdmin.getValue())) {
            organization = new SystemAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.ReviewAdmin.getValue())) {
            organization = new ReviewAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Customer.getValue())) {
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
}
