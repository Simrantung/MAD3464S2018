/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Arithmetic {
    int number1=10;
    
    void addition(){
       System.out.println("addition:" +(number1 + 10));
    };
    
    void addition(int n1, int n2){
        System.out.println("addition:" + (n1+n2));
    }
    
    float addition(float n1, float n2){
        return (n1+n2);
    }
    
    void addition(int... numbers){
  
    int sum=0;
        for(int no: numbers){
            sum += no;
        }
        System.out.println("Sum:" + sum);
    }
    
    //method overloading
    
}
