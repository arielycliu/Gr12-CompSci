
public class StudentInfo {
	
	// attributes
	public int studentNumber;
	public String firstName;
	public StudentInfo next; //ask
	
	// init function
	public StudentInfo() { // default values if user doesn't indicate
		studentNumber = 1;
		firstName = "Carter";
		next = null;
	}
	
	// init with parameters
	public StudentInfo(int studentNumber, String firstName) {
		this.studentNumber = studentNumber;    //this refers to the current object like Ariel.studentNumber
		this.firstName = firstName;
		// we don't want the user to set next
		next = null;
	}
	
}
