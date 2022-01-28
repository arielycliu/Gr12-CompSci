
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
		
		System.out.println((symbolToUse+" ").repeat(sideLength)); // draw top line
		for (int n = 0; n < sideLength-2; n++) { // draw two vertical lines
			System.out.print(symbolToUse);
			System.out.print(" ".repeat(2*sideLength-3)); // draw spaces in center
			System.out.println(symbolToUse); // new line
		}
		System.out.println((symbolToUse+" ").repeat(sideLength)); // draw bottom line
	}
}
