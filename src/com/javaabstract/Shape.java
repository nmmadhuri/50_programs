package com.javaabstract;

public abstract class Shape {
	int len;
	int bre;
	double area;
	double perimeter;
	public double getArea(){
		return area;
	}
	public double getPerimeter(){	
		return perimeter;
	}
	public abstract void computePerimeter();
	public abstract void computeArea();
}
