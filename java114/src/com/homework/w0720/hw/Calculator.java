package com.homework.w0720.hw;

public interface Calculator {
	double getPerimeter();
	double getArea();
}


class Rectangle implements Calculator{
	private double length;
	private double width;
	
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(length+width);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
}

	class Circle implements Calculator{
		private double r;

		
		public Circle(double r) {
			super();
			this.r = r;
		}

		public double getR() {
			return r;
		}

		public void setR(double r) {
			this.r = r;
		}

		@Override
		public double getPerimeter() {
			// TODO Auto-generated method stub
			return 2*3.14*r;
		}

		@Override
		public double getArea() {
			// TODO Auto-generated method stub
			return 3.14*r*r;
		}
		
		
		
	}

