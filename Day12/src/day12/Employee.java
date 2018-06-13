/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day12;

/**
 *
 * @author Jigisha Patel
 * @version 1.0
 * @since 
 */
public class Employee implements java.io.Serializable
{
    public String name;
    public String address;
   
    public int SSN;
    public int number;
   
    
    /**
     * @param Doesn't accept any parameter
     * @
     */
    public void mailcheque()
    {
        System.out.println("mailing a cheque to " + name + "" + address);
    }
   
}