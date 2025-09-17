package com.codegnan.oopexamples;

public class Main {

	public static void main(String[] args) {
		
		//object creation:class objref=new classname();
		Box mybox1=new Box(2.0,6.0,7.0);
		
		System.out.println(mybox1.height);
		double vol;
		vol=mybox1.height*mybox1.depth*mybox1.width;
		System.out.println("Box1 volume is :"+vol);
		
		//another obj creation
		Box mybox2=new Box(5.0,8.0,2.0);
		
		vol=mybox2.height*mybox2.depth*mybox2.width;
		System.out.println("box2 volume is:"+vol);
	}

}
