package src;

public class Circle {
	//Instance variable, circle has an area
	private double area;
	//Static variable, constant
	public static double PI = 3.1416;
	
	public Circle(double radius) {
		this.area = Circle.PI * radius * radius;
	}
}
