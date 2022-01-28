
public class MyShape {
	// Attributes
	public String symbolToUse;
	public int sideLength;
	public MyShape nextShape;
	
	// Constructor
	public MyShape(String symbolToUse, int sideLength) {
		this.symbolToUse = symbolToUse;
		this.sideLength = sideLength;
		this.nextShape = null;
	}

	public double calcArea() {
		if (this instanceof MySquare) { // if the shape is an instance of square
			MySquare theSquare = (MySquare) this; // save as square, type cast
			return theSquare.calcArea(); // run square calcArea function
		} else if (this instanceof MyTriangle) { // if the shape is an instance of triangle
			MyTriangle theTriangle = (MyTriangle) this; // save as triangle, change type
			return theTriangle.calcArea(); // run triangle calcArea function
		}
		return 0.0;
	}
	
	// Methods
	
}
