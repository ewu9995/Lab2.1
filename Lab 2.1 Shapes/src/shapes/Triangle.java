package shapes;

public class Triangle {
	private int base;
	private int height;
	private int side;

	public Triangle(int base, int height, int side) {
		this.base = base;
		this.height = height;
		this.side = side;
	}


	public double calculateArea() {
		double triangleArea = (base*height)/2;
		return triangleArea; 
	}


	public double calculatePerimeter() {
		double trianglePerimeter = base+height+side;
		return trianglePerimeter;
	}


	public String toString() {
		return "Triangle Base: " + base + " Height: " + height + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
 

