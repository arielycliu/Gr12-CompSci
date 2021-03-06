
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
	
	// Methods
	public double calcValue() {
		if (this instanceof MyStudent) { // if the person is an instance of student
			MyStudent theStudent = (MyStudent) this; // save as student, type cast
			return theStudent.calcValue(); // run student calcValue function
		} else if (this instanceof MyTeacher) { // if the person is an instance of teacher
			MyTeacher theTeacher = (MyTeacher) this; // save as teacher, change type
			return theTeacher.calcValue(); // run teacher calcValue function
		}
		return 0.0;
	}
}
