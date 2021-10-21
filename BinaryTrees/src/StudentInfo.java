 
public class StudentInfo {
	// Attributes
	public int studentNumber;
	public String firstName;
	public String lastName;
	public double height; // in cm
	public double weight; // in kg
	public StudentInfo left;
	public StudentInfo right;
	
	// Constructor
	public StudentInfo() {
		studentNumber = -1;
		firstName = "a";
		height = -1.0;
		weight = -1.0;
		left = null;
		right = null;
	}
	
	public StudentInfo(int studentNumber, String firstName, String lastName, double height, double weight) {
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;
		this.weight = weight;
		left = null;
		right = null;
	}
}
