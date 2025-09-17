package com.codegnan.oopexamples;

public class person {
	String name;
	int age;
	//creating a construcotr
	public person(String name,int age) {
		System.out.println("constructor");
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		////////without using constructor///////
		//person p1=new person();
//		p1.name="Kavya";
//		p1.age=22;
//		System.out.println(p1.name+"---"+p1.age);
		//using objects
		person p1=new person("Kavya",22);
		System.out.println(p1.name+"--"+p1.age);
		person p2=new person("Navya",22);
		System.out.println(p2.name+"--"+p1.age);

	}

}
