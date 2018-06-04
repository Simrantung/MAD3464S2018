/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2;

/**
 *
 * @author SUKHCHAIN
 */
public class Activity2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     Bankaccount account = new Bankaccount();
     account.id = "cooi";
     account.name = "simran";
     account.acNo = 101;
     account.ownerName = "gurjot";
     account.balance = 234;
     
     System.out.println(account.toString());
    }
    
}
