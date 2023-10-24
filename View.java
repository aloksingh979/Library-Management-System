package edu.qsp.lms.view;

import java.util.Scanner;

import edu.qsp.lms.controller.Controller;
import edu.qsp.lms.model.Book;
import edu.qsp.lms.model.Library;

public class View {
	static Scanner sc = new Scanner(System.in);
	static Library library = new Library();
	static Controller controller = new Controller();
	static {

		System.out.println("-----Welcome to Library Management System");
		System.out.println();

		System.out.print("Enter name of Library: ");
		String libraryName = sc.nextLine();

		library.setLibraryName(libraryName);
		System.out.println("Enter Address of Library: ");

		String libraryAddress = sc.nextLine();
		library.setLibraryAddress(libraryAddress);

		System.out.println("Enter pincode: ");
		int libraryPincode = sc.nextInt();
		library.setPincode(libraryPincode);

		sc.nextLine();

	}

	public static void main(String[] args) {
		do {
			System.out.println("Select operation to perform");
			System.out.println(
					"1. Add book\n 2. Remove book\n 3. Update book\n 4. Get book by name\n 5. Get all books\n 0. Exit");
			System.out.println("Enter digit respective to desired option");
			int userChoice = sc.nextInt();
			sc.nextLine();
			switch (userChoice) {
			case 0:
				sc.close();
				System.out.println("-----Exited-----");
				System.exit(0);
				break;

			case 1:
				Book book1 = new Book();
				System.out.println("Enter book name: ");
				book1.setBookName(sc.nextLine());

				System.out.println("Enter Author Name: ");
				book1.setBookAuthor(sc.nextLine());

				System.out.println("Enter book price: ");
				book1.setBookPrice(sc.nextDouble());
				sc.nextLine();  // Consume the newline character

				System.out.println("Enter publication: ");
				book1.setPublication(sc.nextLine());
				
				controller.addBook(book1);
				break;
				
			case 2:
				System.out.println("Enter name of the book to remove");
				boolean verifyBookRemove = controller.removeBook(sc.nextLine());
				if(verifyBookRemove)
				{
					System.out.println("Book removed");
				}
				else
				{
					System.out.println("Book does not exist in library");
				}
				break;
				
			case 3:
				Book book3 = new Book();
				
				System.out.println("Enter name of of book to updated: ");
				String bookToUpdate= sc.nextLine();
				book3.setBookName(bookToUpdate);
				System.out.println("Enter new Price: ");
				double newPrice = sc.nextDouble();
				book3.setBookPrice(newPrice);
				sc.nextLine();
				
				if (controller.updateBookPriceByBookName(book3)) {
					System.out.println("Book price Updated");
				} else {
					System.out.println("Book does not exist in library");
				}
				break;
				
			case 4:
				System.out.println("Enter Book Name: ");
				String bookToget = sc.nextLine();
				Book book4 = controller.searchBook(bookToget);
				if (book4!=null) {
					System.out.println(book4);
				} else {
					System.out.println("Book is not in library");
				}
				break;
			case 5:
				System.out.println(controller.getAllBooks());
				break;

			default:
				System.out.println("-----Invalid Selection-----");
				break;
			}
		} while (true);
	}
}
