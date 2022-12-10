/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author arpitajaiswal
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount useracc : userAccountList)
            if (useracc.getUsername().equals(username) && useracc.getPassword().equals(password)){
                return useracc;
            }
        return null;
    }
    
    public UserAccount removeUserAccount(UserAccount useraccount){
        userAccountList.remove(useraccount);
        return useraccount;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        
        
        UserAccount uacc = new UserAccount();
        uacc.setPassword(password);
        uacc.setEmployee(employee);
        uacc.setUsername(username);
        uacc.setRole(role);
        
        userAccountList.add(uacc);
        return uacc;
    }
    
    
    public UserAccount fetchUserAccount(String username){
        for (UserAccount useracc : userAccountList){
            if (useracc.getUsername().equals(username))
                return useracc;
        }
        return null;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount useracc : userAccountList){
            if (useracc.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    
}
