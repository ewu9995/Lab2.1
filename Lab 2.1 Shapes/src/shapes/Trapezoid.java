package shapes;


public class Trapezoid implements Shape {
	private int a;
	private int b;
	private int c;
	private int d;
	

	public Trapezoid(int length1, int width1, int length2, int width2) {
		this.a = length1;
		this.b = width1;
		this.c = length2;
		this.d = width2;
	}


	public double calculateArea() {
		int x = ((b*b)-(d*d)+(a-c)*(a-c))/(2*(a-c));
		double area = (((a+c)/2) * Math.sqrt((b*b) - (x*x)));
		return area; 
	}


	public double calculatePerimeter() {
		double perimeter = a+b+c+d;
		return perimeter;
	}


	public String toString() {
		return "Trapezoid Width: " + b + ", " + d  + " Length: " + a+", " +c + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
