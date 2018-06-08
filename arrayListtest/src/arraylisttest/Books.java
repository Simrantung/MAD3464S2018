/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttest;

import java.util.Comparator;

/**
 *
 * @author mk889
 */
public class Books {
    int bookID;
    String bookTitle;
    int bookRating;
    
    Books(){
        this.bookID = 0;
        this.bookTitle = "Unknown";
        this.bookRating = 0;
    }
    
    Books(int bookID, String bookTitle, int bookRating){
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.bookRating = bookRating;
    } 
    
    void setBookId(int id){
        this.bookID = id;
    }
    int getBookID(){
         return this.bookID;
    }
     
    void setBookTitle(String title){
        this.bookTitle = title;
    } 
    
    String getBookTitle(){
        return this.bookTitle;
    }
    
    void setRating(int rate){
        this.bookRating = rate;
    }
    
    int getRating(){
        return this.bookRating;
    }
    
    void displayInfo(){
        System.out.println("BookID : " + this.bookID +
                "\n Book Title : " + this.bookTitle +
                "\n Book Rating : " + this.bookRating);
    }
}

class bookTitleComparator implements Comparator<Books>{
    
    @Override
    public int compare(Books o1, Books o2){
        return o1.bookTitle.compareToIgnoreCase(o2.bookTitle);
    }
}

