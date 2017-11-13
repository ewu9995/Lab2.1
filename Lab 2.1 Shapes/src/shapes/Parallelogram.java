package shapes;

public class Parallelogram {
	private int length;
	private int width;

	public Parallelogram(int length, int width) {
		this.length = length;
		this.width = width;
	}


	public double calculateArea() {
		double area = length*width;
		return area; 
	}

	public double calculateHeight() {
		double height =
			return height;
	}

	public double calculatePerimeter() {
		double perimeter = (2*length) + (2*width);
		return perimeter;
	}


	public String toString() {
		return "Parallelogram Width: " + width + " Base: " + length + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
