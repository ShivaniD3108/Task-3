package task3;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
	private Book[] books;
	private int capacity;
    private int count;
    Scanner sc=new Scanner(System.in);
    
    public Library(int capacity) {
        this.capacity = 5;
        this.books = new Book[capacity];
        this.count = 0;}
	
	public void addBook(Book book) {
		try{if(count<capacity) {
				books[count++]=book;
				System.out.println("Book added successfully.");
				return;
			}	
		throw new ArrayIndexOutOfBoundsException();	
	} catch(ArrayIndexOutOfBoundsException e) {
    System.out.println("Library is full.Remove existing books to add new books.");
    }
}	
		
	public void display() {
		if(count==0) {
			System.out.println("Books are yet to be added. Enter choice 1 to add books.");
		}else {
			System.out.println(Arrays.toString(books));
		}
	}
	public void removeBook(int bookID) {
		boolean bookFound = false;
		for(int index=0;index<books.length;index++) {
			if(books!=null && books[index].getBookId()==bookID) {
			books[index]=books[count-1];
			books[count-1]=null;
			count--;
			System.out.println("Book removed successfully");
			bookFound=true;
			break;
		}
			if(!bookFound){
				System.out.println("Book not found");
			}
	  }
	}
	
	public Book searchBook(int id){
		for(Book book: books) {
			if(book!=null && book.getBookId()==id) {
				book.setAvailable(false);
				return book;
			}
		}
		return null;
	}
}
