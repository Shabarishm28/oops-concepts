package oops2;

interface shape {
	double calculateArea();
	double calculatePerimeter();

}

class Rectangle implements shape {

	private double length;
	private double width;


	public Rectangle(double length, double width) {

		this.length = length;
		this.width = width;

	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 * (length + width);
	}
}

class Circle implements shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

}

public class AbstractionusingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shape rect = new Rectangle(2.0, 5.0);
		shape circle = new Circle(4.0);
		
		System.out.println("Area of rectangle = "+rect.calculateArea());
		System.out.println("Perimeter of rectangle = "+rect.calculatePerimeter());
		
		System.out.println("Area of Circle = "+circle.calculateArea());
		System.out.println("Perimeter of Circle = "+circle.calculatePerimeter());
		
	}

}
