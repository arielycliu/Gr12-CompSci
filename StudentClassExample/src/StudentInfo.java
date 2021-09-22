
public class StudentInfo {
	
	// Attributes
	
	public int studentNumber; // attributes
	public String firstName;
	public String lastName;
	public double height; // in metres
	public double weight; // in kg
	
	
	// Constructors

	public StudentInfo() {
		studentNumber = -1;
		firstName = "Foghorn";
		lastName = "Leghorn";
		height = -1.0;
		weight = -1.0;	
	}
	
	public StudentInfo(int sN, String firstName, String lastName, double h, double w) {
		
		studentNumber = sN; // try to be consistent for using this. or using different attribute and parameter names
		this.firstName = firstName;
		this.lastName = lastName; //parameter
		// lastName = this.lastName() also works
		height = h;
		weight = w;
		
	}
	
	public static void stuff() {
		System.out.println("sdklfj");
	}
	
	// Methods
	
	public double calcBMI() { //Have to indicate what type of value we're returning
		/*
		double theBMI = weight / (height * height);
		return theBMI;
		*/
		return (weight / (height * height));
	}
	
	public void doSomething(String myStr) {
		System.out.println("hi there " + myStr);
	}
	

}
