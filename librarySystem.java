package com.codegnan.oopexamples;

public class librarySystem {

	public static void main(String[] args) {
		Book b1=new Book("abc","xyz");
		Book b2=new Book("abcd","xyza");
		System.out.println("intial book details");
		b1.displayInfo();
		System.out.println("Borrow book");
		b1.borrowBook();
		b1.borrowBook();
		
		System.out.println("Return Book");
		b1.returnBook();
		b1.returnBook();
		System.out.println("updated information");
		b1.displayInfo();
		

	}

}
