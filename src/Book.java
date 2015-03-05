/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
public class Book {
    private String title;
    private String author;
    private short page;

    public Book(){
        this.title="";
        this.author="";
        this.page=0;
    }
    public Book(String title, String author, short page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }
    
    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", page=" + page + '}';
    }
    
}


   
    


   