package quiz_3;

import quiz_3.GeometricObject;

public class Triangle extends GeometricObject{
	private double side1=1.0;
	private double side2=1.0;
	private double side3=1.0;
	
	Triangle() {
	}
	
	public Triangle(double s1, double s2, double s3) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public double getPerimeter() {
		double perimeter = side1 + side2 +side3;
		return (perimeter);
	}
	
	public double getArea() {
		double sides = (side1+side2+side3)/2;
		double area = Math.sqrt(sides*(sides - side1)*(sides-side2)*(sides-side3));
		return (area);
	}
	
	public String toString() {
		double Area = this.getArea();
		double Perimeter = this.getPerimeter();
		
		String description = "Triangle has sides of length"+side1+","+side2+","+side3+", with an area of"+Area+", and a perimeter of"+Perimeter;
		
		return(description);
	}
}

