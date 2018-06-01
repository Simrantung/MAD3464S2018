/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;
import java.util.Scanner;
/**
 *
 * @author macstudent
 */
public class Person {
    
    String name;
    String address;
    char gender;
    int age;
    String phoneNo;
    Scanner in =new Scanner(System.in);
    
    //default constructor
    Person()
    {
        this.name = "unknown";
        this.address = "unknown";
        this.phoneNo = "unknown";
        this.age = 1;
        this.gender = 'U';
    }
    
    //parameterized constructor
    Person(String name, String address, String phoneNo, char gender, int age){
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.gender = gender;
        this.age = age;
    }
    
    //copy constructor
    Person(Person anotherPerson){
        this.name = anotherPerson.name;
        this.address = anotherPerson.address;
        this.age = anotherPerson.age;
        this.phoneNo = anotherPerson.phoneNo;
        this.gender = anotherPerson.gender;
        }
    
    void setName() {
         System.out.println("enter name :");
        name = in.nextLine();
    }

    String getname() {
         return name; 
    }

    void setAddress() {
         System.out.println("enter address :"); 
         address = in.nextLine();
    }

    String getAdress() {
         return address; 
    }

    void setPhoneNo() {
        System.out.println("enter phone no :");
        phoneNo = in.nextLine();
    }

    String getPhoneNo() {
        return phoneNo;
        
    }

    void setGender() {
         System.out.println("enter gender :");
        gender =(char)in.nextInt();
       // String nextLine = in.nextLine();
                
    }

    char getGender() {
        return gender; 
    }

    void setAge() {
        System.out.println("enter age :" );
        //age = in.nextInt();
        age = Integer.parseInt(in.nextLine());
    }

    int getAge() {
        return age; 
    }
    @Override
     public String toString()
    {
        String data ;
        data = "Name :" + name + "\n" +"Address :" + address + "\n" + "PhoneNo :" + phoneNo + "\n" +"Gender :" + gender+ "\n" + "Age :" + age+ "\n";
        return data;
    }
     void setData()
     {
         setName();
         setAddress();
         setPhoneNo();
         setAge();
         setGender();
     }
    
}
    

