package com.codegnan.oopexamples;

public class Boxdemo {
	double height;
	double width;
	double depth;
	
	public Boxdemo(double height, double width, double depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	//1.instance method -without return without parameters
	public void volume() {
	System.out.println("box volume is:");
	System.out.println(height*depth*width);
	}
	//2.without return with parameters
	public void setdimension(double h,double w,double d) {
		double volume=h*w*d;
		System.out.println("volume is :" +volume);
	}
	//3.with return without parametrs
	public double vol() {
		return height*width*depth;
	}
	//4.with return with parameters
	public double calvolume(double h2,double d2,double w2) {
		return h2*d2*w2;
	}
	
	public static void main(String[] args) {
		Boxdemo b1=new Boxdemo(3.0,2.0,3.0);//1
		b1.volume();
		
		b1.setdimension(10.0,20.0,30.0);//2
		
		Boxdemo b2=new Boxdemo(4.0,5.0,6.0);//3
		System.out.println("b2 vol is :" +b2.vol());
		
		System.out.println("calculate volume:" +b2.calvolume(2.0,3.0,4.0));//4
	}

}
