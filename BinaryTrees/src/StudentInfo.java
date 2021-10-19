 
public class StudentInfo {
	// Attributes
	public int studentNumber;
	public String firstName;
	public String lastName;
	public double height; // in cm
	public double weight; // in kg
	public StudentInfo leftNode;
	public StudentInfo rightNode;
	
	// Constructor
	public StudentInfo() {
		studentNumber = -1;
		firstName = "a";
		height = -1.0;
		weight = -1.0;
		leftNode = null;
		rightNode = null;
	}
	
	public StudentInfo(int studentNumber, String firstName, String lastName, double height, double weight) {
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;
		this.weight = weight;
		leftNode = null;
		rightNode = null;
	}
}
