/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

    public Employee createEmployee(String name) {
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    
    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    public Employee uniqueEmployee(String name) {
        for (Employee em : employeeList) {
            if (em.getName().equals(name)) {
                return em;
            }
        }
        return null;
    }
}

