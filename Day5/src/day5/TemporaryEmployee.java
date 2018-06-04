/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

/**
 *
 * @author macstudent
 */
public class TemporaryEmployee extends Employee{
    String designation;
    float hourlyRate;
    
    TemporaryEmployee(){
        super();
        this.designation = "Unassigned";
        this.hourlyRate = 0.0f;
    }
    
    TemporaryEmployee(String name, String address, String phoneNo,
            int age, char gender, String empId, int dept,
            String joiningDate, String designation, float hourlyRate){
        this.designation = designation;
        this.hourlyRate = hourlyRate;
    }
    @Override
     public String toString(){
        return(super.toString() +
                "\nDesignation : " + this.designation + 
                "\nHourlyRate: " + this.hourlyRate);
     }
}
