package Business;

import Business.Role.SystemAdminRole;
import Business.Employee.Employee;
import Business.UserAccount.UserAccount;

/**
 *
 * @author anirudhnegi
 */
public class Configuration {

    public static AdminPanel configure() {
AdminPanel system = AdminPanel.getInstance();
      

        Employee emp = system.getEmployeeDirectory().createEmployee("admin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", emp, new SystemAdminRole());

       

        return system;
    }

}
