package com.codegnan.oopexamples;

public class garbagetest {
	protected void finalize() {
		System.out.println("Garbage collector called finalize method");
	}

	public static void main(String[] args) {
		garbagetest obj=new garbagetest();
		obj=null;
		System.out.println("Requesting garbage collection..");
		System.gc();
		System.out.println("End of main");

	}

}
