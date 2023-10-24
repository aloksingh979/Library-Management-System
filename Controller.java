package edu.qsp.lms.controller;

import java.util.*;

import edu.qsp.lms.model.Book;
import edu.qsp.lms.model.Library;

public class Controller {
	private Library library = new Library();
	//========================================================Add
	public void addBook(Book book) {
		List<Book> books = library.getBooks();
		if (books==null) {
			books=new ArrayList<>();
			library.setBooks(books);
		}
		books.add(book);
	}
	//=======================================================Search
	public Book searchBook(String bookName) {
		List<Book> books = library.getBooks();
		
		Iterator<Book> iterator = books.iterator();
		
		while (iterator.hasNext()) {
			Book book = (Book) iterator.next();
			if (book.getBookName().equalsIgnoreCase(bookName)) {
				return book;
			}
		}
		return null;
	}
	//========================================================Delete
	public boolean removeBook(String bookName) {
		Book book = searchBook(bookName);
		if (book!=null) {
			List<Book> books = library.getBooks();
			books.remove(book);
			return true;
		}
		return false;
	}
	//========================================================update
	public boolean updateBookPriceByBookName(Book refBook) {
		Book book = searchBook(refBook.getBookName());
		if(book!=null)
		{
			book.setBookPrice(refBook.getBookPrice());
			return true;
		}
		return false;
	}
	//=======================================================getAllBooks
	public List<Book> getAllBooks() {
		return library.getBooks();
	}
	
}
