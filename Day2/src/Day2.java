/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Day2 {
    public static void main(String args[]){
        
        int i=1;
        
        while(i<6){
            System.out.println("i:"+i);
           i++;
        }
        System.out.println("loop ended");
        
        i=6;
        do{
            //System.out.println("i:"+i);
            i++;
        }while(i<6);
        
        for(i=1; i<6; i++){
            if(i==3){
                break;
            }
            System.out.println("i:"+i);
            
            for(i=1; i<6; i++){
            if(i==3){
                continue;
            }
            System.out.println("i:"+i);
            
        }
            
            int numbers[]=new int[5];
            
            
            for(int j=10, k=0; k<numbers.length; k++, j+=10){
                numbers[k]=j;
                System.out.println("numbers["+k+")="+numbers[k]);
            }
            
            for(int no:numbers){
                System.out.println("no:"+no);
            }
            int ar1[][]= new int[4][3];
            i=10;
            for(int row=0; row<4; row++){
                for(int col=0; col<3; col++){
                    ar1[row][col]=i++;
                    //System.out.println("ar1["+row+"]["+col+")="+ar1[row][col]);
                    System.out.print(ar1[row][col]+" ");
                }
                System.out.println("");
            }
            
            for(int row=0; row<5; row++){
                for(int col=0; col<=row; col++){
                    System.out.print("* ");
                }
                System.out.println("");
            }
            
            for(int row=0; row<5; row++){
            for(int space=5; space>row; space--){
                System.out.print(" ");
            }
                for(int col=0; col<=row; col++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            
            //upside down triangle
            for(int row=5; row>0; row--){
            for(int space=5; space>row; space--){
                System.out.print(" ");
            }
                for(int col=0; col<row; col++){
                    System.out.print("* ");
                }
                System.out.println();
            
            }
            
            //upside down triangle
            for(int row=5; row>0; row--){
            for(int space=5; space>row; space--){
                System.out.print(" ");
            }
                for(int col=0; col<row; col++){
                    System.out.print("HK ");
                }
                System.out.println();
            }
            
            
        }
    

