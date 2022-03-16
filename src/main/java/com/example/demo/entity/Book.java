package com.example.demo.entity;

public class Book {
	
	private String bookName;
	private String isbn;
	public Book(String bookName, String isbn) {
		super();
		this.bookName = bookName;
		this.isbn = isbn;
	}
	public Book() {
		super();
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}
