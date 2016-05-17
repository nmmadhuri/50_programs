package com.javaabstract;

public class Square extends Shape {

	Square(int side)
	{
		super.len = super.bre = side;

	}

	
	public void computeArea(){
		super.area = super.len * super.bre;
	}
	public void computePerimeter(){
		super.perimeter = super.len * 4;
	}

}
