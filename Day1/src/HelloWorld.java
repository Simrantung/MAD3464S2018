/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class HelloWorld {
   public static void main(String args[]){
       System.out.println("Hello World");
       //System.in
       //System.err
       int number=10;
       float fnumber=10.2f;
       double dnumber=10.23455;
       short n1;
       long n2;
       
       number*=10;
       System.out.println("number:"+number);
       number=20;
       System.out.println("number:"+(number+10));
       System.out.println(10+number+"number:");
       
       /*
       //number=number/0;
       */
       
       char ch='a'; //97
       System.out.println("ch:"+ch);
       System.out.println("ch:"+(char)(ch+1));  //-b
       
       ch++; //ch=ch+1
       System.out.println("ch:"+ch);  //ch=b
       
       ch++; //ch=ch+1
       System.out.println("ch:"+ch); //ch=c
       
       ch='c';
       char anotherCh=--ch;
       System.out.println("ch:"+ch);
       System.out.println("anotherch:"+anotherCh);
       
       String name="HK";
       System.out.println("Name:"+name);
       
       boolean flag=false;
       System.out.println("flag:"+flag);
       
       if(!flag){
           System.out.println("Name:"+name);
       }else{
           System.out.println("Name is missing");
       }
       
       char vowel='a';
       
       switch(vowel){
       case'a':
       case 'e':
       case 'i':
       case 'o':
       case 'u':
           System.out.println("given character is vowel");
           
           switch(10+20){
               case 10:
                   System.out.println("not match");
                   break;
               case 30:
                   System.out.println("matched");
                   break;
                   
                   
           }
       
   }
       
       
   } 
}
