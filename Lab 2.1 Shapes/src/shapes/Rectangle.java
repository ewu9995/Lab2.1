package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *	Evan Wu and Jeffrey Lau Period 2 11/15/17 Lab 2.1 shapes
 */
public class Rectangle implements Shape {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	//A = lw
	public double calculateArea() {
		double area = length*width;
		return area; 
	}

	//P = 2l+2w
	public double calculatePerimeter() {
		double perimeter = (2*length) + (2*width);
		return perimeter;
	}


	public String toString() {
		return "Rectangle Width: " + width + " Length: " + length + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
