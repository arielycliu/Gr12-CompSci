
public class MyPerson {
	// Attributes
	public String symbolToUse;
	public int height;
	public int weight;
	public MyPerson nextPerson;
	
	// Constructor
	public MyPerson(String symbolToUse, int height, int weight) {
		this.symbolToUse = symbolToUse;
		this.height = height;
		this.weight = weight;
		this.nextPerson = null; // always set to null
	}
}
