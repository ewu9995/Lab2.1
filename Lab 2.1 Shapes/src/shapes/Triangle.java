package shapes;

public class Triangle implements Shape {
	private int a;
	private int b;
	private int c;

	public Triangle(int base, int side1, int side2) {
		this.a = base;
		this.b = side1;
		this.c = side2;
	}


	
	
	public double calculateArea() {
		int p = (a+b+c)/2;	
		double area = (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
		return area; 
	}


	public double calculatePerimeter() {
		double perimeter = a+b+c;
		return perimeter;
	}


	public String toString() {
		return "Triangle Base: " + a +  " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
 

