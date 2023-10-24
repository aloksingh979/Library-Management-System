package edu.qsp.lms.model;
import java.util.*;

public class Library {
	private String libraryName;
	private String libraryAddress;
	private int pincode;
	private List<Book> books;
	
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public String getLibraryAddress() {
		return libraryAddress;
	}
	public void setLibraryAddress(String libraryAddress) {
		this.libraryAddress = libraryAddress;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books; 
	}
	
	@Override
	public String toString() {
		return "Library [libraryName=" + libraryName + ", libraryAddress=" + libraryAddress + ", pincode=" + pincode
				+ "]";
	}
	
	
}
