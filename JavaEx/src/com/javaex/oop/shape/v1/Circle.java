package com.javaex.oop.shape.v1;

public class Circle extends Shape {
	//	필드
	private double radius;
	
	// 	생성자
	public Circle(int x, int y, double radius) {
		super(x,y);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.printf(
				"원[x=%d, y=%d, r=%f, area=%f]을 그렸습니다.%n",
				x, y, radius,area());
		
	}

	@Override
	public double area() {
//		double area = Math.PI * Math.pow(radius, 2);
//		return area:
		return Math.PI * Math.pow(radius,2);	//	 다른방법(간단)
	}
	
	
	
	
}
