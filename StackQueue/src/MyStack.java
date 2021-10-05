//MyStack
//
//Has attributes top and numInStack.  
//The stack is initialized (via the constructor) to being empty.
//
//Has methods push, pop, peek, displayStack.  
//push and displayStack are to be void methods.  
//pop and peek return reference to the item popped/peeked, 
//and return null if the stack is empty.  
//displayStack is to use System.out.println to walk through 
//and print the students in the stack from top to bottom 
//(and is to say that the stack is empty if it is indeed empty).


public class MyStack {
	
	//attributes
	public int numInStack;
	public StudentInfo top;
	
	// init -> constructor
	public MyStack() {
		numInStack = 0;
		top = null;
	}
	
	// displayStack - print out each student
	public void displayStack() {
		if (top == null) {  // if the list is empty
			System.out.println("\nEMPTY LIST");
			return;
		}
		// else: the list must have stuff inside
		System.out.println("\nWe have " + numInStack + " elements: ");
		StudentInfo currentStudent = top;
		
		// loop thru to print names
		for (int i = 0; i < numInStack; i++) {
			System.out.println(currentStudent.firstName);
			currentStudent = currentStudent.next;
		}
		return;
	}
	// push - put an item onto the top of the stack
	public void push(StudentInfo studentToAdd) {
		if (top == null) {  // if the list is empty
			studentToAdd.next = null; // make sure the student isn't pointing to anything since it's the only thing in the list
			top = studentToAdd;
			numInStack = 1;
			return;			
		}
		// else: the list must have stuff in it already
		studentToAdd.next = top; // have the new top point to the previous top (now second)
		top = studentToAdd;
		numInStack++; // make sure to increase count by 1
		return;
	}
	// pop - remove item from the top of the stack - return ref value
	
}
