/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8;

/**
 *
 * @author mk889
 */
public class Circle extends Shape {
    
    Circle(int x, int y){
        super(x,y);
    }
    
    @Override
    void draw(){
        /*super.x = 10;
        super.y = 20;
        System.out.println("x :" +super.x);
        System.out.println("y :" +super.y);
        System.out.println("Drawing circle");
*/
        
        System.out.println("Drawing circle at" + super.x + "and" +super.y);
    }
    
    
    
}
