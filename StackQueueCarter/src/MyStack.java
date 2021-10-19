
public class MyStack {
	
	// attributes
	public int numInStack;  //length
	public StudentInfo top; //ref val
	
	// init
	public MyStack() {
		numInStack = 0;
		top = null;
	}
	
	// peak (return ref val of top)
	// displayStack (displayList)
	
	// push (add to front)
	// length, student.next, top points to student
	public void push(StudentInfo newStudent) {
		if (top == null) {
			// add student
			top = newStudent;
			newStudent.next = null;
			numInStack = 1;
			return;
		}
		// list must already have stuff in it
		numInStack++; // adding one to length
		newStudent.next = top;
		top = newStudent;
		return;
	}
	
	// pop (remove from front)
	public StudentInfo pop() {
		if (top == null) {
			return null;
		}
		// list must already have stuff
		StudentInfo studentToRemove = top;
		top = studentToRemove.next;  // set equal to second plate
		studentToRemove.next = null;
		numInStack--;
		return studentToRemove;
	}
	
	// peak - return ref value of top item
	public StudentInfo peak() {
		return top;
	}
	
	// display - print Stack
	public void displayStack() {
		if (top == null) {
			System.out.println("empty");
			return;
		}
		// loop thru to print names
		
		StudentInfo currentStudentToPrint = top;
		
		for (int i = 0; i < numInStack; i++) {
			System.out.println(currentStudentToPrint.firstName);
			currentStudentToPrint = currentStudentToPrint.next;
		}
		return;
	}
	
	
	
}
