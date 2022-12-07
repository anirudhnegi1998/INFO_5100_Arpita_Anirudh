/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.AdminPanel;
import Business.Network.Network;
import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author arpitajaiswal
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.Camp) {
            enterprise = new CampEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.Event) {
            enterprise = new EventEnterprise(name);
            enterpriseList.add(enterprise);
        }
//        if(type ==  Enterprise.EnterpriseType.Event){
//            enterprise = new MediaEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
        return enterprise;
    }
    
    
    public boolean IsDuplicateEnterprise(String name){
        for(Enterprise enterprise: enterpriseList){
             if(enterprise.getName().equals(name)){
                 return true;
             }
     }
        return false; 
    }
    
     public Enterprise removeEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = fetchEnterprise(name, type);
        if (type == Enterprise.EnterpriseType.Hospital) {
            enterpriseList.remove(enterprise);
        }
        if (type == Enterprise.EnterpriseType.Camp) {
            enterpriseList.remove(enterprise);
        }
        if (type == Enterprise.EnterpriseType.Event) {
            enterpriseList.remove(enterprise);
        }
        return enterprise;
    }
     
     public Enterprise fetchEnterprise(String name, Enterprise.EnterpriseType type){
         for(Enterprise enterprise: enterpriseList){
             if(enterprise.getName().equals(name) && enterprise.getEnterpriseType().equals(type)){
                 return enterprise;
             }
           
         }
           return null;
     }
     
     public void fetchNetwork(String name, Enterprise.EnterpriseType type,AdminPanel system, Network newNetwork){
         for (Network network : system.getNetworkList()) {
         for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
             if(enterprise.getName().equals(name) && enterprise.getEnterpriseType().equals(type)){
                 network.setName(newNetwork.getName());
             }
         }
        }
     }
     
    public Enterprise createAndAddCampEnterprise(String name, String street, String city, String state, String zipcode, String peopleAffected, String percentChild, String percentElder, int campId, Date eventDate, Enterprise.EnterpriseType type, String campHospital) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.Camp) {
            enterprise = new CampEnterprise(name, street, city, state, zipcode, peopleAffected, percentChild, percentElder, campId, eventDate, campHospital);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
    public Enterprise createAndAddEventEnterprise(String name, String street, String city, String state, String zipcode, Date eventDate, Enterprise.EnterpriseType type, int budgetCount) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Event) {
            enterprise = new EventEnterprise(name,street,city,state,zipcode,eventDate,type, budgetCount);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }


}
