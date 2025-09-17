package com.codegnan.oopexamples;

public class Employeetest {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setdetails("Kavya",30000.0);
		
		System.out.println("HRA allowance is :" +emp.calHRA());
		System.out.println("DA allowance is :" +emp.calDA());
		double grosssalary=emp.grosssalary();
		
		System.out.println("Emplyoee name :" +emp.name);
		System.out.println("EMployee basic salary :" +emp.basicsalary);
		System.out.println("Gross salary :" +grosssalary);

	}

}
