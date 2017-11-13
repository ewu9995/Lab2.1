package shapes;

public class Square extends Rectangle {

	int side;

	public Square(int side) {
		super(side, side);
		this.side = side;
	}
	

	public double calculateArea() {
		double squareArea = side*side;
		return squareArea; 
	}


	public double calculatePerimeter() {
		double squarePerimeter = (4*side);
		return squarePerimeter;
	}


	public String toString() {
		return "Square Side: " + side  + " Area: " + this.calculateArea() + " Perimeter: "	+ this.calculatePerimeter();
	}
}

	