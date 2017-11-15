package shapes;

import java.util.Random;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *	Evan Wu and Jeffrey Lau Period 2 Lab 2.1 shapes
 */

public class ShapeUtilities {

	/**
	 * Creates a random shape from the choices.
	 * 
	 * @return Shape Student Work: Update with your own shape.
	 */
	public static Shape randomShape() {
		Random rand = new Random();
		int x = rand.nextInt(5);

		switch (x) {
		case 0:
			return new Circle(rand.nextInt(100));
		case 1:
			return new Rectangle(rand.nextInt(50), rand.nextInt(50));
		case 2:
			return new Square(rand.nextInt(50));
		case 3:
			return new Triangle(rand.nextInt(20), rand.nextInt(20), rand.nextInt(20));
		case 4:
			return new Trapezoid(rand.nextInt(20),rand.nextInt(20),rand.nextInt(20), rand.nextInt(20));
		default:
			return new Circle(rand.nextInt(100));
		}
 
	}

	/**
	 * adds up the area of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumArea(Shape[] shapes) {
		double sumArea = 0;
		for ( int x = 0; x < shapes.length ;x++) {
			sumArea = sumArea + shapes[x].calculateArea();
		}
		return sumArea;
		
	}

	/**
	 * adds up the perimeter of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumPerimeter(Shape[] shapes) {
		double sumPerimeter = 0; 
		for ( int x = 0; x < shapes.length ;x++) {
			sumPerimeter = sumPerimeter + shapes[x].calculatePerimeter();
		}
		return sumPerimeter;
		
	}
}
