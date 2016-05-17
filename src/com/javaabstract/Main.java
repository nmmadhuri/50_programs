package com.javaabstract;

public class Main {
	public static void main(String[] args) {
		Square s1= new Square(5);
		
		s1.computeArea();
		s1.computePerimeter();
		
		System.out.println("Area of square is "+ s1.getArea());
		System.out.println("Perimeter of square is "+ s1.getPerimeter());
		
		Rectangle r1=new Rectangle(5,10);
		System.out.println("Area of the Rectangle:"+r1.getArea());
		System.out.println("Perimeter of the Rectangle:"+r1.getPerimeter());
		
	}

}
