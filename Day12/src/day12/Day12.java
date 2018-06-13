/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day12;


//import day12.Generics.Box;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;

/**
 *
 * @author macstudent
 */
public class Day12 {

    /**
     * @param args the command line arguments
     *n@return No return value
     * @exception IOException while performing Input output from file
     * @exception ClassNotFoundException
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));
        System.out.printf("Integer Value :%d\n", integerBox.get());
        
        Box<String> stringBox = new Box<String>();
        stringBox.set(new String("Hello World"));
        System.out.printf("String Value :%s\n\n", stringBox.get());
        
        //test Generic method printArray
        //Create arrays of Integer, Double and Character
        
        /* Employee emp = new Employee();
        emp.name=" ashley";
        emp.address = "vancouver";
        emp.SSN =444444;
        emp.number= 101;
       
        try
        {
            FileOutputStream fileOut = new FileOutputStream("employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
           
            out.writeObject(emp);
           
            out.close();
            fileOut.close();
           
            System.out.printf("serialized data is saved as employee.txt");
           
        }catch(IOException i){
            i.printStackTrace();
        }
        //desearilization
        Employee e= null;
       
        try
        {
            FileInputStream fileIn = new FileInputStream("employee.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
           
             e= (Employee) in.readObject();
            
             in.close();
             fileIn.close();
        }catch(IOException i)
        {
            i.printStackTrace();
            return;
        }catch(ClassNotFoundException c)
        {
            System.out.println("\n Employee class not found");
            c.printStackTrace();
            return;
        }*/
     
    }
    

    //Generic class
    class Box<T>{
        private T t;
        
        public void set(T t){
            this.t = t;
    }
    
    public T get(){
        return t;
    }
    } 
   
    }
}


    
    

