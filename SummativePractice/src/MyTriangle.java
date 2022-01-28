import java.lang.Math; // import math for area calculations
public class MyTriangle extends MyShape{
	
	// Attributes
	public int triOrientation;
	
	// Constructor
	public MyTriangle(String symbolToUse, int sideLength) { // two parameters
		super(symbolToUse, sideLength); // constructor from MyShape that inits nextShape as null
		this.triOrientation = 1; // set as default of 1
	}
	
	// Methods
	public double calcArea() { // take no parameters, return double
		if (sideLength < 1) { // if less than 1 return -1
			return -1;
		} else {
			double n = Math.sqrt(3) / 4; // use to calculate area: root3/4 * n^2
			return n * (sideLength * sideLength); // return area of triangle
		}
	}
	
	public void drawShape() { // no input, no return
		if (sideLength < 1) { // if less than 1, exit
			return ;
		}
		// Otherwise, draw triangle
	}
	
}
