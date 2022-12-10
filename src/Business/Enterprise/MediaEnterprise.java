/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anirudhnegi
 */
public class MediaEnterprise extends Enterprise {
    
    public MediaEnterprise(String name){
        super(name, Enterprise.EnterpriseType.Event);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public ArrayList<Organization> getSupportedType() {
        return null; 
    }
    
}
