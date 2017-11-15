package shapes;

//Evan Wu and Jeffrey Lau Period 2 11/15/17 Lab 2.1 shapes
	
public class Rhombus implements Shape {
		private int a;
		private int b;
	

		public Rhombus(int diagonal1, int diagonal2) {
			this.a = diagonal1;
			this.b = diagonal2;
		
		}


		//Area = diagonal1 x diagonal2 /2
		public double calculateArea() {
			double area = (a*b)/2;
			return area; 
		}

		//side = sqrt(d1^2+d2^2)/2
		//perimeter = 4 * side as side is the same for rhombus
		public double calculatePerimeter() {
			double side = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2))/2;
			double perimeter = side*4;
			return perimeter;
		}
	 
	 
		public String toString() {
			return "Rhombus diagonal1: " + a + " " + "diagonal2: " + b +  " "  + " Area: " + this.calculateArea() + " Perimeter: "
					+ this.calculatePerimeter();
		}
	}
	 

