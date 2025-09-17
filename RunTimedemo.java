package com.codegnan.oopexamples;
//import java.sql.Date;
public class RunTimedemo {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("Total memory of the heap : "+r.totalMemory());
		System.out.println("Free memory of the heap : "+r.freeMemory());
		for(int i=0;i<10000;i++) {
			//Date d=new Date();
			//d=null;
	}
		System.out.println("free memory of the heap : "+r.freeMemory());
		r.gc();
		System.out.println("Free memory of the heap : "+r.freeMemory());
}
}
