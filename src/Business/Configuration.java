package Business;

import Business.Role.SystemAdminRole;
import Business.Employee.Employee;
import Business.UserAccount.UserAccount;

/**
 *
 * @author anirudhnegi
 */
public class Configuration {

    public static EcoSystem configure() {
EcoSystem system = EcoSystem.getInstance();
      

        Employee emp = system.getEmployeeDirectory().createEmp("admin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", emp, new SystemAdminRole());

       

        return system;
    }

}
