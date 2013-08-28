/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concretepractice;

/**
 *
 * @author dkerr
 */
public class SalariedEmployee extends Employee {
    private double salary;
    
    public void SalariedEmployee(int empNum, String fName, String lName, String address, double salary) {
         EmployeeAll(empNum, fName, lName, address);
         System.out.println("Salary: " + salary);
    }
}
