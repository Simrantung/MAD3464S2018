/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6;

/**
 *
 * @author macstudent
 */
public class Addition implements arithmetic, multiplication{

    @Override
    public void display() {
        //n1 = 20;
        //n2 = 40;
        System.out.println("Addition : " + (n1+n2));
    }
    
    @Override
    public void multiplication() {
        //n1 = 20;
        //n2 = 40;
        System.out.println("Multiplication : " + (n1*n2));
    }
    
}
