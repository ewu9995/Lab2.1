package shapes;

//Evan Wu and Jeffrey Lau Period 2 Lab 2.1 shapes

public class Square extends Rectangle {

	int side;

	public Square(int side) {
		super(side, side);
		this.side = side;
	}
	

	public double calculateArea() {
		double area = side*side;
		return area; 
	}


	public double calculatePerimeter() {
		double perimeter = (4*side);
		return perimeter;
	}


	public String toString() {
		return "Square Side: " + side  + " Area: " + this.calculateArea() + " Perimeter: "	+ this.calculatePerimeter();
	}
}

	
