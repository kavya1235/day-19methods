package com.codegnan.oopexamples;

public class coffeeshop {

	public static void main(String[] args) {
				
				coffee firstorder=new coffee("Latte","Medium",true);//creating objects
				coffee secondorder=new coffee("Espresso","small",false);
				coffee thirdorder=new coffee("cappuccino","Large",true);
				System.out.println("Oders:");
				firstorder.displayorder();
				secondorder.displayorder();
				thirdorder.displayorder();
			}
				

			}

