package shapes;
/**
 * @author Mr Levin Created 10/16/2017
 * 	Evan Wu and Jeffrey Lau Period 2 Lab 2.1 shapes
 *         Lab 2.1 shapes Create implement all necessary methods in this package
 *         to run the code below successfully. After your code below runs
 *         successfully, you will design, implement, and test a couple of your
 *         own Shape classes.
 * 
 *         Choose one of the following: Triangle, Pentagon, Hexagon, Heptagon,
 *         etc. Choose one of the following: Rhombus, Trapezoid, Parallelogram,
 *         Kite
 * 
 *         Both classes must extend shape, and implement all necessary methods.
 */
public class Runner {
	//NOTE: Triangle is ONLY for REGULAR triangles and Trapezoid is ONLY for REGULAR trapezoids!
	public static void main(String[] args) {
		Shape circle1 = new Circle(3); //radius
		Shape rectangle1 = new Rectangle(10, 4); //length, width
		Shape square1 = new Square(10); //side length
		Shape triangle1 = new Triangle(72,76,52); // side1, base, side2  
		Shape trapezoid1 = new Trapezoid(30,20,18,20); //length1(bottom base), width1(left side), length2(top base), width2(right side) 
		
		System.out.println("First test out the hard coded shape arraay.\n\n");
		Shape[] shapeArr = { circle1, rectangle1, square1, triangle1, trapezoid1};

		for (Shape shape : shapeArr) {
			System.out.println(shape);
		}
		System.out.println("\nDid the five shapes above add up to the total printed here?\n");
		System.out.println("Total Area: " + ShapeUtilities.sumArea(shapeArr)); // 168.26
		System.out.println("Total Perimeter: " + ShapeUtilities.sumPerimeter(shapeArr)); // 86.84
		System.out.println("\nDid the five shapes above add up to the total printed here?\n");

		System.out.println("\n\n Now testing the random array.\n");

		shapeArr = new Shape[10];
  
		// Why are we using a for loop instead of a for-each loop here?
		for (int i = 0; i < shapeArr.length; i++) {
			shapeArr[i] = ShapeUtilities.randomShape();
		}

		for (Shape shape : shapeArr) {
			System.out.println(shape);
		}

		System.out.println("\nTotal Area: " + ShapeUtilities.sumArea(shapeArr));
		System.out.println("Total Perimeter: " + ShapeUtilities.sumPerimeter(shapeArr));

	}

}
