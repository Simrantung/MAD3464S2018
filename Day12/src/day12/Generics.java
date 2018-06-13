/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day12;

/**
 *
 * @author macstudent
 */
public class Generics {
    //Generic class
    public static <E> void printArray( E[] inputArray){
        //Display array elements
        for(E element : inputArray) {
         System.out.printf("%s ,", element);
      }
      System.out.println();
    }
   
    // determines the largest of three Comparable objects
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
      T max = x;   // assume x is initially the largest
      
      if(y.compareTo(max) > 0) {
         max = y;   // y is the largest so far
      }
      
      if(z.compareTo(max) > 0) {
         max = z;   // z is the largest now                 
      }
      return max;   // returns the largest object   
   }
    
    public static void main(String args[]){
        //test Generic class Box
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));

        System.out.printf("Integer Value :%d\n", integerBox.get());
        System.out.printf("String Value :%s\n\n", stringBox.get());
        
         //test Generic method printArray
         // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        System.out.println("Array integerArray contains:");
        printArray(intArray);   // pass an Integer array

        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);   // pass a Double array

        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        System.out.println("\nArray characterArray contains:");
        printArray(charArray);   // pass a Character array
        
        //test Generic method maximum
        System.out.printf("Max of %d, %d and %d is %d\n\n", 
         3, 4, 5, maximum( 3, 4, 5 ));

        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
         6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ));

        System.out.printf("Max of %s, %s and %s is %s\n","pear",
         "apple", "orange", maximum("pear", "apple", "orange"));
    }  
}

//Generic class
class Box<T> {
    private T t;

    public void add(T t) {
      this.t = t;
    }

    public T get() {
      return t;
    }
}
   