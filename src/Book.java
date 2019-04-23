/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
/**
 *
 * @author Ahmed
 */
public class Book implements Serializable {
    private String name,author,category; //commonly used 
    private int isbn,noCopy; // commonly used
    static final long serialVersionUID = 40L;//

    public Book() {
        name = " "; author = " "; category = " ";
        isbn = 0; noCopy = 0; //short for: Number of Copies
    }

    public Book(String name, String author, String category, int isbn, int noCopy) {
        this.name = name.toLowerCase();
        this.author = author.toLowerCase();
        this.category = category.toUpperCase();
        this.isbn = isbn;
        this.noCopy = noCopy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author.toLowerCase();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category.toLowerCase();
    }

    
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNoCopy() {
        return noCopy;
    }

    public void setNoCopy(int noCopy) {
        this.noCopy = noCopy;
    }
    
    public boolean loanable(){ // depends on number of copies
        if(getNoCopy() == 0)          // could be useful for borrow class
            return false;
        else
            return true;
    }
    
    public void bookBorrow(){
        noCopy--;
    }
    
    public void bookReturn(){
        noCopy++;
    }
    
    @Override
    public String toString(){ //to get details of the book 
        return String.format("Book Details :\n-Title: %s \n-Author: %s \n-"
                + "Category: %s \n-ISBN: %d \n-Number of copies: %d\n", getName(),
                getAuthor(),getCategory(),getIsbn(),getNoCopy());
    }
    
   
   
}
