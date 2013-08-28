/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concretepractice;

/**
 *
 * @author dkerr
 */
public class Employee {
    private int empNum;
    private String fName;
    private String lName;
    private String address;
    
    public void EmployeeAll(int empNum, String fName, String lName, String address) {
        EmployeeNumber(empNum);
        EmployeeFirstName(fName);
        EmployeeLastName(lName);
        EmployeeAddress(address);
    }
    
    public void EmployeeNumber(int empNum) {
       System.out.println("Employee Number: " + empNum);
    }
    
    public void EmployeeFirstName(String fName) {
        System.out.println("First Name: " + fName);
    }
    
    public void EmployeeLastName(String lName) {
        System.out.println("Last Name: " + lName);
    }
    
    public void EmployeeAddress(String address) {
        System.out.println("Address: " + address);
    }

    

    
    
}
