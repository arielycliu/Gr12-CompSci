
public class MyShape {
	// Attributes
	public String symbolToUse;
	public int sideLength;
	public MyShape nextShape;
	
	// Constructor
	public MyShape(String symbolToUse, int sideLength, MyShape nextShape) {
		this.symbolToUse = symbolToUse;
		this.sideLength = sideLength;
		this.nextShape = nextShape;
	}
}
