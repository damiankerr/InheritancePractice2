/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concretepractice;

/**
 *
 * @author dkerr
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee {
    private double bonus;
    
    public void SalaryPlusBonusEmployee(int empNum, String fName, String lName, String address, double salary, double bonus) {
        SalariedEmployee(empNum, fName, lName, address, salary);
        System.out.println("Bonus: " + bonus);
    }
}
