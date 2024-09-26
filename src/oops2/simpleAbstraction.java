package oops2;

//Abstract class representing a shape
abstract class shapes {
	// Abstract method for calculating area (to be implemented by subclasses)
	public abstract double calculateArea();
}

//Concrete subclass Circle inheriting from Shape
class circleShape extends shapes {
	private double radius;

	public circleShape(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}

//Concrete subclass Rectangle inheriting from Shape
class rectangleArea extends shapes {
	private double length;
	private double width;

	public rectangleArea(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return length * width;
	}
}

public class simpleAbstraction {
	public static void main(String[] args) {
		// Create instances of Circle and Rectangle
		Circle circle = new Circle(5);
		Rectangle rectangle = new Rectangle(4, 6);

		// Calculate area using abstraction
		System.out.println("Circle Area: " + circle.calculateArea());
		System.out.println("Rectangle Area: " + rectangle.calculateArea());
	}
}
