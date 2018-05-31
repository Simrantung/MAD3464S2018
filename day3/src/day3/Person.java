/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Scanner;

/**
 *
 * @author SUKHCHAIN
 */
class Person {

    String name;
    String address;
    char gender;
    int age;
    String phoneNo;
    Scanner in =new Scanner(System.in);
    
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
