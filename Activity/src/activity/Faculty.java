/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity;

/**
 *
 * @author macstudent
 */
public class Faculty implements Person1, Employee1{
    
    @Override
    public void display(){
        System.out.println("name :" + name);
        System.out.println("age :" + age);
        System.out.println("employeetype :" + employeetype);
        System.out.println("salary :" + salary);
    }
    
    String course;
    
    void setCourse(){
        System.out.println("enter course : ");
    }
    
    String getCourse(){
        return course;
    }

    @Override
    public void read() {
        
    }
    
    
}
