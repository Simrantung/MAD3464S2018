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
//inheritance
public class Bankaccount  extends Bank
{
    int acNo;
    String ownerName;
    int balance;
    
    //default constructor
    Bankaccount()
    {
        super();
        this.acNo = acNo;
        this.ownerName =ownerName;
        this.balance = balance;
       
    }
    
    //parametrised constructor
    Bankaccount(String id,String name,int acNo,String ownerName,int balance)
    {
        super(id,name);
        this.acNo = acNo;
        this.ownerName =ownerName;
        this.balance = balance;
        
    }

    @Override
    public String toString()
    {
        String bankdetails = super.toString();
        String data = "account number :" + this.acNo + "\n" + "owner name :" + 
                this.ownerName + "\n" + "balance :" + this.balance;
        data = bankdetails+data;
        
        return data;
    }
}
