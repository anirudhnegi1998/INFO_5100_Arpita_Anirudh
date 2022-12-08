/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author anirudhnegi
 */
public class EmployeeDirectory {

    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee createEmp(String name) {
        Employee emp = new Employee();
        emp.setName(name);
        employeeList.add(emp);
        return emp;
    }
    
    public void removeEmp(Employee emp) {
        employeeList.remove(emp);
    }

    public Employee uniqueEmp(String name) {
        for (Employee emp : employeeList) {
            if (emp.getName().equals(name)) {
                return emp;
            }
        }
        return null;
    }
}
