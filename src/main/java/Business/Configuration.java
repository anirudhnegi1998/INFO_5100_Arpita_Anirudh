/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author arpitajaiswal
 * 
 */
import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

public class Configuration {
      public static AdminPanel configure() {

        AdminPanel system = AdminPanel.getInstance();
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        Employee employee = system.getEmployeeDirectory().createEmployee("admin");

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole());

        return system;
    }
}
