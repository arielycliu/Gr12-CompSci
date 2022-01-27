
public class MySquare extends MyShape {
	
	// Constructor
	public MySquare(String symbolToUse, int sideLength, MyShape nextShape) {
		super(symbolToUse, sideLength, nextShape); // constructor from MyShape
	}
	
	// Methods
	public double calcArea() {
		return 2.0;
	}
	
	public void drawShape() {
		
	}
}
