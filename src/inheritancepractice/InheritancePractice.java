/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;
import concretepractice.*;

//import abstractpractice.Employee;
//import interfacepractice.Employee;
/**
 *
 * @author dkerr
 */
public class InheritancePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee e1 = new Employee();
        e1.EmployeeAll(123, "John", "Doe", "123 Blank Lane\n");
        
        HourlyEmployee e2 = new HourlyEmployee();
        e2.HourlyEmployee(999, "Bob", "Smith", "999 Oak Street", 25.50);
        System.out.println("");
        
        SalariedEmployee e3 = new SalariedEmployee();
        e3.SalariedEmployee(777, "Jane", "Doe", "777 Elm Ct.", 45800.00);
        System.out.println("");
        
        SalaryPlusBonusEmployee e4 = new SalaryPlusBonusEmployee();
        e4.SalaryPlusBonusEmployee(222, "Eric", "Smith", "222 Maple Ave.", 52000.00, 4000);
        System.out.println("");
        
    }
}
