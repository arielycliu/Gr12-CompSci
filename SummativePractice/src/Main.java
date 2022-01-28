
public class Main {
	public static void main(String[] args) {
		// Testing Square
		MySquare theSquare;
		theSquare = new MySquare();
		
		theSquare.symbolToUse = "&";
		theSquare.sideLength = 1;
		theSquare.drawShape();
		System.out.println(theSquare.calcArea());
		
		theSquare.symbolToUse = "$";
		theSquare.sideLength = 2;
		theSquare.drawShape();
		System.out.println(theSquare.calcArea());
		
		theSquare.symbolToUse = "*";
		theSquare.sideLength = 3;
		theSquare.drawShape();
		System.out.println(theSquare.calcArea());
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		// Testing Triangle
		MyTriangle theTriangle;
		theTriangle = new MyTriangle("A", 5);

		theTriangle.symbolToUse = "*";
		theTriangle.sideLength = 1;
		theTriangle.triOrientation = 1;
		theTriangle.drawShape();
		System.out.println(theTriangle.calcArea());
		
		theTriangle.symbolToUse = "#";
		theTriangle.sideLength = 2;
		theTriangle.triOrientation = 1;
		theTriangle.drawShape();
		System.out.println(theTriangle.calcArea());
		
		theTriangle.symbolToUse = "R";
		theTriangle.sideLength = 3;
		theTriangle.triOrientation = 1;
		theTriangle.drawShape();
		System.out.println(theTriangle.calcArea());
		
		theTriangle.nextShape = theSquare;
//		System.out.println(((MySquare) theTriangle.nextShape).calcArea()); // ask him about this
		System.out.println(theTriangle.nextShape.calcArea());
		System.out.println(theTriangle.nextShape.nextShape);
	}
}
