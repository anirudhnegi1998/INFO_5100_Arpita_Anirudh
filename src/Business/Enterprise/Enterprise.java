/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.HealthCamp.HealthCampDirectory;
import Business.Organization.OrganizationDirectory;
import Business.Organization.Organization;
import java.util.ArrayList;
import Business.Role.Role;

/**
 *
 * @author anirudhnegi
 */
public abstract  class Enterprise extends Organization 
{
    private OrganizationDirectory organizationDirectory;
    private EnterpriseType enterpriseType;


    public OrganizationDirectory getOrganizationDirectory() 
    {
        return organizationDirectory;
    }

   

    
    public enum EnterpriseType 
    {
        Hospital("Hospital"),

        Camp("Health Camp"),

        Event("Fund Raiser");
    //    Media("Media");

        private String value;
        private EnterpriseType(String value) 
        {
            this.value = value;
        }

        public String getValue() 
        {
            return value;
        }


        @Override
        public String toString() {
            return value;
        }
    }
    public abstract ArrayList<Organization> getSupportedType();
    public abstract ArrayList<Role> getSupportedRole();

    
    
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }


    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }


    public Enterprise(String name, EnterpriseType type) 
    {
        super(name);
        this.enterpriseType = type;
        
        organizationDirectory = new OrganizationDirectory();
     }
    
    @Override
        public String toString() 
        {
            return this.getName();
        }
    
}
