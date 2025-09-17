package com.codegnan.oopexamples;

public class student {
	String name;
	int[] marks;
	public void setdetails(String n,int[] m) {
		this.name=n;
		this.marks=m;
	}
	public int calTotal() {
		int totalmarks=0;
		for(int i=0;i<marks.length;i++) {
		totalmarks+=marks[i];
		}
		return totalmarks;
	}

	public double calAverage() {
		return calTotal()/marks.length;
		
	}
	public void displaydetails() {
		System.out.println("Student name :" +name);
		System.out.println("Total marks :" +calTotal());
		System.out.printf("Averagemarks : %2f",calAverage());
	}

	public static void main(String[] args) {
		student s1=new student();
		String sname="Kavya";
		int[] smarks= {90,89,85,92,96};
		s1.setdetails(sname,smarks);
		s1.displaydetails();


	}
}


