/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
import java.util.Scanner;
public class VolumeDemo {
    public static void main (String []args){
        short NumberOfBooks = 0;
		 String title;
		 String author, volumeName;
		 Volume [] volume1 = null;
		 Book [] book = null;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("How many books are you adding today?");
		int count = input.nextInt();
		book= new Book[count];
		volume1= new Volume[count];
		for(int i=0; i<count;i++){
			System.out.println("Please enter the author's name");
			author = input.next();
                        System.out.println("Please enter title");
			title=input.next();
			System.out.println("Please enter number of pages");
			int numberOfPages= input.nextInt();
			book[i]= new Book(title,author, (short) numberOfPages);
			System.out.println("Volume name");
			volumeName=input.next();
			System.out.println("Volume number");
			NumberOfBooks=(short)input.nextInt();
			volume1[i]= new Volume (volumeName,NumberOfBooks, book);
		}
		for(int p=0;p<count;p++){
		System.out.println(volume1[p].getBookArray());
		}
		
	}
	
	
	

}

    
    

