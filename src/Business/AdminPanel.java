package Business;

import java.util.ArrayList;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
/**
 *
 * @author arpitajaiswal
 */
public class AdminPanel extends Organization {

    private static AdminPanel business;
    
    private ArrayList<Network> listNetwork;

    public static AdminPanel getInstance() {
        if (business == null) {
            business = new AdminPanel();
        }
        return business;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        listNetwork.add(network);
        return network;
    }
    
    public void removeNetwork(Network network) {
        listNetwork.remove(network);
    }
    
    public void updateNetwork(Network network,String name){
        for(Network n:listNetwork){
            if(n.equals(network)){
                n.setName(name);
            }
        }
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private AdminPanel() {
        super(null);
        listNetwork = new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return listNetwork;
    }

    public void setNetworkList(ArrayList<Network> listNetwork) {
        this.listNetwork = listNetwork;
    }

    public boolean checkIfUserIsUnique(String userName) {
        if (this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }
        return true;
    }

    public boolean isDuplicateNetwork(String name) {
     for(Network n:listNetwork){
            if(n.equals(name)){
                return true;
            }
        }    
    return false;
    }

    
}