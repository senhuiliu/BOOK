/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
    public class Volume {
    private String volumeName;
    private short NumberOfBooks;
    private Book [] book;

    

    
    public Volume(){
        this.NumberOfBooks=0;
        this.volumeName="";
        this.book= new Book[0];
    }
    public Volume(String volumeName, short NumberOfBooks, Book[] book) {
        this.volumeName = volumeName;
        this.NumberOfBooks = NumberOfBooks;
        this.book = book;
    }

    public String getBookArray() {
        String BookL="";
            for(Book i:book){
            BookL += i;
                
        }
        return BookL;
    }
   public Book getBookArray(int NumberOfBooks){
		return book[this.NumberOfBooks];
    }
   @Override
    public String toString() {
        return "Volume{" + "volumeName=" + volumeName + ", NumberOfBooks=" + NumberOfBooks + ", book=" + book + '}';
    }
    }



