package com.codegnan.oopexamples;

public class calculateperimeter {
	
public static double rectangleperimeter(double length,double width){
return 2*(length+width);
}
public static double squareperimeter(double side) {
	return 4*side;
}
public static double circleperimeter(double radius) {
	return 2*3.14*7;
}
public static double traingleperimeter(double a,double b,double c) {
	return a+b+c;
}
public static double parallelogramperimeter(double base,double side) {
	return 2*(base+side);
}


public static void main(String args[]) {
	System.out.println("RectanglePerimeter "+rectangleperimeter(10,5));
	System.out.println("Squareperimeter :" +squareperimeter(6));
	System.out.println("Circleperimeter " + circleperimeter(7));
	System.out.println("Traingleperimeter :" +traingleperimeter(3,4,5));
	System.out.println("Parallelogramperimeter :" +parallelogramperimeter(8,5));
	
}
}
