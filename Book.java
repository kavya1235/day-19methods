package com.codegnan.oopexamples;

public class Book {
	String title;
	String author;
	boolean isAvailable;
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}
	public void borrowBook() {
	if(isAvailable) {
		isAvailable=false; 
			System.out.println("Book is already borrowed");
	}else {
			System.out.println("Book is already borrowed not available");
		}
	}
	
	public void returnBook() {
		if(!isAvailable) {
			isAvailable=true;
			System.out.println("Book was returned");
		}else {
			System.out.println("book was not borrowed so can't return");
		}
	}

	public void displayInfo() {
		System.out.println("Book title :" +title);
		System.out.println("Author name :" +author);
		System.out.println("Availability status :" +(isAvailable?"true":"false"));
	}
}


