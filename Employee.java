package com.codegnan.oopexamples;

public class Employee {
	String name;
	double basicsalary;
public void setdetails(String n,double salary) {
	name=n;
	basicsalary=salary;
}
public double calHRA() {
	return 0.20*basicsalary;
}
public double calDA() {
	return 0.10*basicsalary;
}
public double grosssalary(){
	return basicsalary+calHRA()+calDA();
}




	}


