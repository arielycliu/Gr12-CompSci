
public class Main {
	public static void main(String[] args) {
		MySquare theSquare;
		theSquare = new MySquare();
		
		theSquare.symbolToUse = "&";
		theSquare.sideLength = 5;
		System.out.println(theSquare.sideLength);
		theSquare.drawShape();
	}
}
