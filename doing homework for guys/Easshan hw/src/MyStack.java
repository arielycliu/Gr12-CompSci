public class MyStack {
	public int numInStack;
	public StudentInfo top;
	public MyStack() {
		numInStack = 0;
		top = null;	
	}
	public void push(StudentInfo newTop) { //null top case?
		StudentInfo oldTop;
		oldTop = top;
		top = newTop;
		top.next = oldTop;
		numInStack++;
		return;
	}
	
	public void displayStack() {
		if (numInStack == 0) {
			System.out.println("The stack is empty");
			return;
		}
		StudentInfo nextVal;
		nextVal = top;
		while (nextVal != null) {
			System.out.println(nextVal.firstName);
			System.out.println(nextVal.studentNumber);
			nextVal = nextVal.next;
			}
	}
	
	public StudentInfo pop() {
		if (numInStack == 0) {
			return null;
		}
		//list must have stuff
		StudentInfo studentToRemove = top; // set studentToRemove as the current top
		top = studentToRemove.next; // set new top to the old top's next
		studentToRemove.next = null; // make sure it's not pointing to anything since it's leaving the list
		numInStack--;
		return studentToRemove;
	}
	public StudentInfo peek() {
		return top;
	}
}