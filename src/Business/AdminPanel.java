/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

// importing package with .java class

import Business.Enterprise.Enterprise;

import Business.Organization.Organization;
import Business.Network.Network;
import Business.Role.Role;

import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author arpitajaiswal
 */
public class AdminPanel extends Organization {

    private ArrayList<Network> networkList;
    private static AdminPanel business;
    
    

    public static AdminPanel getInstance() {
        
        if (business == null) {
            business = new AdminPanel();
        }
        return business;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        
        networkList.add(network);
        
        return network;
    }
    
    public void removeNetwork(Network network) {
        
        networkList.remove(network);
    }
    
    public void updateNetwork(Network network,String name){
        
        for(Network n:networkList){
            
            if(n.equals(network)){
                
                n.setName(name);
            }}
    }

    @Override
    public  ArrayList  <Role>  getSupportedRole(){
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add (new SystemAdminRole());
        
        return roleList;
    }

    private AdminPanel() 
    {
        super(null);
        
        networkList = new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        
        this.networkList = networkList;
    }

    public boolean checkIfUserIsUnique(String userName) {
        if(this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }
        
        return true;
    }

    public boolean isDuplicateNetwork(String name) {
     for(Network n:networkList){
            
         if(n.equals(name)){
                
             return true;
            }
        }    
    return false;
    }}
