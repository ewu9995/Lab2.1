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
	//note: doesn't work if one number is an outlier due to sum of two sides must be greater than that of the largest side 
	public double calculateArea() {
		double p = (a+b+c)/2.0d;	
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return area; 
	}

	//perimeter = add all sides up
	public double calculatePerimeter() {
		double perimeter = a+b+c;
		return perimeter;
	}
 
 
	public String toString() {
		return "Triangle Base: " + b + " " + "Side1: " + a + " "+  " " + "Side2: " + c + " "+ " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
 

