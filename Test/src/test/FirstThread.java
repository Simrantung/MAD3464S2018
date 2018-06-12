/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author macstudent
 */
public class FirstThread extends Thread{
    
    public FirstThread()
    {
        super("first thread");
        System.out.println("first thread created");
        start();
    }
    
    public void run(){
        try{
            for (int i=1; i<=5; i++){
                System.out.println("first thread : " + i);
                Thread.sleep(1000);
        }
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }finally{
            System.out.println("Exiting first thread");
        }
    }
    
}
