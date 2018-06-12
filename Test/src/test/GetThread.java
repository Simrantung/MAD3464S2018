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
public class GetThread {
    public static void main(String []args){
        
        try{
        Thread t1 = Thread.currentThread();
        
        System.out.println("current thread : " + t1);
        t1.setName("My Thread");
        t1.setPriority(10);
        System.out.println(" thread info : " + t1);
        System.out.println("is alive : " + t1.isAlive());
        System.out.println("deamon : " + t1.isDaemon());
        System.out.println("interrupted : " + t1.isInterrupted());
        
        for (int i=1; i<=5; i++){
            System.out.println("main thread : " + i);
            new FirstThread();
            new SecondThread("Second test");
            new SecondThread("Second Inning");
            
            Thread.sleep(5000);
        }
        
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
