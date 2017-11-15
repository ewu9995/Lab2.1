package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *	Evan Wu and Jeffrey Lau Period 2 Lab 2.1 shapes
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
		double area = (radius*radius*pi);
		return area;
	}

	public double calculatePerimeter() {
		double perimeter = (radius*2*pi);
		return perimeter;
	}
	public String toString() {
		return "Circle radius: " + radius + " Area: " + this.calculateArea() + " Circumference: " + this.calculatePerimeter();
	
	}
}
