package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public class Circle implements Shape {

	// fields
	private int radius;
	private static double pi = 3.14;

	/**
	 * Constructor method
	 * 
	 * @param radius
	 */
	public Circle(int radius) {
		this.radius = radius;
	}

	public double calculateArea() {
		double circleArea = (radius*radius*pi);
		return circleArea;
	}

	public double calculatePerimeter() {
		double circlePerimeter = (radius*2*pi);
		return circlePerimeter;
	}
	public String toString() {
		return "Circle radius: " + radius + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
	
	}
}
