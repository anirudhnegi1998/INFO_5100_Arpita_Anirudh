package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author arpitajaiswal
 */
public class Configuration {

    public static AdminPanel configure() {

        AdminPanel system = AdminPanel.getInstance();
        //Create a network
        //create an enterprise
        //initialize some organizations
        Employee emp = system.getEmployeeDirectory().createEmployee("admin");
        //create an user account
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", emp, new SystemAdminRole());

        return system;
    }

}
