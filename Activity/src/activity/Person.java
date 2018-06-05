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
public class Person {
    String name;
    int age;
    Scanner in =new Scanner(System.in);
    
    //default constructor
    Person()
    {
        this.name = "unknown";
        this.age = 1;
    }
    
    //parameterized constructor
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
            

void setName() {
         System.out.println("enter name :");
        name = in.nextLine();
    }

    String getname() {
         return name; 
    }
    
void setAge(){
    System.out.println("enter age ;");
    //age = in.nextLine();
    age = Integer.parseInt(in.nextLine());
}

int getAge(){
    return age;
}
}