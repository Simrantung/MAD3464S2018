/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity;
import java.util.Scanner;
/**
 *
 * @author macstudent
 */
public class Employee {
   String employeetype;
   Integer salary;
   Scanner in =new Scanner(System.in);
   
   //default constructor
   Employee()
   {
       this.employeetype = "unknown";
       this.salary = 0;
   }
   
   //parameterized constructor
   Employee(String employeetype, Integer salary)
   {
      this.employeetype = employeetype;
      this.salary = salary;
   }
   
   void setEmployeeType(){
       System.out.println("enter employee type : ");
       employeetype = in.nextLine();
   }
   String getEmployeeType(){
       return employeetype;
   }
   
   void setSalary(){
       System.out.println("enter salary : ");
       //salary = in.nextLine();
       salary = Integer.parseInt(in.nextLine());
   }
   Integer getSalary(){
       return salary;
   }
}
