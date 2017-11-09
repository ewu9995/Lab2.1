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
		double area = (base*height)/2;
		return area; 
	}


	public double calculatePerimeter() {
		double perimeter = base+height+side;
		return perimeter;
	}


	public String toString() {
		return "Triangle Base: " + base + " Height: " + height + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
 

