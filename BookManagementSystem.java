package task3;

import java.util.Scanner;

public class BookManagementSystem {
public static void main(String[] args) {
	
	Library library=new Library(10);
	Scanner sc=new Scanner(System.in);
	
	
	while(true) {
		System.out.println("Enter a choice");
		System.out.println("1-Add a book");
		System.out.println("2-Remove a book");
		System.out.println("3-Search a book");
		System.out.println("4-Display all books");
		System.out.println("5-Choose 5 to exit program");
		
		int choice=sc.nextInt();
	switch(choice) {
	case 1:{
		System.out.println("Enter id:");
		int id=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter title:");
		String bookTitle=sc.nextLine();

		System.out.println("Enter author:");
		String bookAuthor=sc.nextLine();

		Book book=new Book(id,bookTitle,bookAuthor);
		library.addBook(book);
		break;
		}
	case 2:{
		System.out.println("Enter id of book to be removed:");
		int bookId=sc.nextInt();
		library.removeBook(bookId);
		break;
	}
	case 3:{
		System.out.println("Enter id of book to search: ");
		int idSearch=sc.nextInt();
		Book bookSearch=library.searchBook(idSearch);
		System.out.println((bookSearch!=null)?("Book found"+bookSearch):("Book not found"));
		break;
	}
	case 4:{
		System.out.println("Here we go");
		library.display();
		break;
	}
	case 5:
	{
		System.out.println("Thank you");
		System.exit(0);
		break;	
	}
	default:{
		System.out.println("Invalid choice");
	}
	}
}
}
}

