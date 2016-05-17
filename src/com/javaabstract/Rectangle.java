package com.javaabstract;

public class Rectangle extends Shape {
	
	 Rectangle(int len,int bre){
		 this.len=len;
		 this.bre=bre;
	 }
	public double computeArea(double area){
		
		area=super.len*super.bre;
		
		return area;
	}
	public double computePerimeter(double perimeter){
		
		perimeter=2*(super.len+super.bre);
		
		return perimeter;
		
	}

}
