package shapes;

//Evan Wu and Jeffrey Lau Period 2 Lab 2.1 shapes
public class Triangle implements Shape {
	private int a;
	private int b;
	private int c;

	public Triangle(int base, int side1, int side2) {
		this.a = side1;
		this.b = base;
		this.c = side2;
	}


	
	//Heron's formula
	public double calculateArea() {
		double p = (a+b+c)/2.0d;	
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
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
 

