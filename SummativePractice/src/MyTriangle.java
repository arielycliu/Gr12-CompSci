
public class MyTriangle extends MyShape{
	
	// Attributes
	public int triOrientation;
	
	// Constructor
	public MyTriangle(String symbolToUse, int sideLength, MyShape nextShape, int triOrientation) {
		super(symbolToUse, sideLength, nextShape); // constructor from MyShape
		this.triOrientation = triOrientation;
	}
	
	// Methods
	public double calcArea() {
		return 2.0;
	}
	
	public void drawShape() {
		
	}
	
}
