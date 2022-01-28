
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
			// java turns division of int < 1 into zero so avoid by using *0.5 instead
			return sideLength * sideLength * 0.5; // return area of triangle
		}
	}
	
	public void drawShape() { // no input, no return
		if (sideLength < 1) { // if less than 1, exit
			return ;
		}
		// Otherwise, draw triangle
		for (int n = 0; n <= sideLength; n++) { // repeat for height of triangle
			System.out.println(symbolToUse.repeat(n)); // draw one line of triangle
		}
	}
	
}
