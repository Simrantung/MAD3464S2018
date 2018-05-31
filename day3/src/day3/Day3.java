/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

/**
 *
 * @author SUKHCHAIN
 */
public class Day3 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person hitesh = new Person();
        hitesh.name = "Hiteshwar";
        hitesh.address = "Mississauga";
        hitesh.gender ='M';
        hitesh.age = 22;
        hitesh.age=22;
        hitesh.phoneNo = "416-828-0869";
        System.out.println("name :" +hitesh.name);
        System.out.println("address :" +hitesh.address);
        System.out.println("gender :" + hitesh.gender);
        System.out.println("age :" + hitesh.age);
        System.out.println("phone No :" + hitesh.phoneNo);
       /** 
        Person shashank = new Person();
        shashank.setName();
        System.out.println("name :" + shashank.getname());
        shashank.setAddress();
        System.out.println("Address : " +shashank.getAdress());
       shashank.setPhoneNo();
       System.out.println("PhoneNo :" + shashank.getPhoneNo());
      
       shashank.setAge();
       System.out.println("Age :" + shashank.getAge());
        shashank.setGender();
       System.out.println("Gender :" +shashank.getGender());
       
       System.out.println(shashank.toString());*/
       
       Person saloni = new Person(); 
        saloni.setData();
        System.out.println(saloni.toString());
      
    }
    
}
