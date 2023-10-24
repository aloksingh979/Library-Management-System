package edu.qsp.lms.model;

public class Book {
	private String bookName;
	private String bookAuthor;
	private double bookPrice;
	private String publication;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	
	@Override
	public String toString() {
		return "[bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPrice=" + bookPrice
				+ ", publication=" + publication + "]";
	}
	

}
