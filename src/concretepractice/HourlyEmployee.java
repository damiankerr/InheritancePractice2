/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concretepractice;

/**
 *
 * @author dkerr
 */
public class HourlyEmployee extends Employee {
    private double wage;
    
    public void HourlyEmployee(int empNum, String fName, String lName, String address, double wage) {
        EmployeeAll(empNum, fName, lName, address);
        System.out.println("Wage: " + wage);
    }
}
