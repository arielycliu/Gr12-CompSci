
public class MySquare extends MyShape { // make sure subclass of MyShape
	
	// Constructor
	public MySquare() { // doesn't take any parameters
		super("@", 5);  // set symbolToUse and sideLength, also sets nextShape as null
	}
	
	// Methods
	public double calcArea() { // take no parameters, return double
		if (sideLength < 1) { // if less than 1 return -1
			return -1;
		} else {
			return sideLength * sideLength; // return area of square
		}
	}
	
	public void drawShape() { // method to draw shape
		if (sideLength < 1) { // if less than 1, exit
			return ;
		}
		// sideLength must be valid now
		for (int n = 0; n < sideLength; n++) { // repeat for height of square
			System.out.println(symbolToUse.repeat(sideLength)); // draw one line of square
		}
	}
}
