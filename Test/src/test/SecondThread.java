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
public class SecondThread implements Runnable{
    
    String name;
    Thread t;
    
    public SecondThread(String name){
        this.name = name;
        t = new Thread(this, this.name);
        System.out.println("New Second thread : " + t);
        t.start();
    }

    @Override
    public void run() {
       try{
           for (int i=1; i<=3; i++){
                System.out.println("second thread : " + i);
                Thread.sleep(500);
        }
       }catch(InterruptedException ex){
            ex.printStackTrace();
        }finally{
            System.out.println("Exiting second thread");
       }
    }
    
}
