//MyQueue
//
//Has attributes front and numInQueue.  
//The queue is initialized (via the constructor) to being empty.
//
//Has methods enqueue, dequeue, displayQueue.  
//enqueue and displayQueue are to be void methods.  
// enqueue is add to rear
// dequeue is remove from front
//dequeue returns reference to the item dequeued, and return null if the queue is empty.  
//displayQueue is to work like displayStack, but prints out the students from the front to the rear.

public class MyQueue {
	
	// attributes
	public int numInQueue;
	public StudentInfo front;

	// constructor
	public MyQueue() {
		numInQueue = 0;
		front = null;
	}
	// displayQueue - print out each student from front to rear
	public void displayQueue() {
		if (front == null) {  // if the list is empty
			System.out.println("empty");
			return;
		}
		// else: the list must have stuff inside
		StudentInfo currentStudent = front;
		
		// loop thru to print names
		for (int i = 0; i < numInQueue; i++) {
			System.out.println(currentStudent.firstName);
			currentStudent = currentStudent.next;
		}
		return;
	}
	
	// enqueue - basically add to rear, adds student to the end of the queue
	public void enqueue(StudentInfo studentToAdd) {
		if (front == null) {  // if the list is empty
			studentToAdd.next = null;
			front = studentToAdd;
			numInQueue = 1;
			return;
		}
		// go to the end of the queue
		
		StudentInfo currentStudent = front;
		while (currentStudent.next != null) {
			currentStudent = currentStudent.next;
		}
		// now we have the last element in queue
		currentStudent.next = studentToAdd; // add the new student
		numInQueue++;
		return;
	}
	
	// dequeue - basically remove from front, removes the first student from the queue and returns it
	public StudentInfo dequeue() {
		if (front == null) {  // if the list is empty
			return null;
		}
		// list has stuff in it
		StudentInfo studentToRemove = front;
		front = studentToRemove.next; // set the front to the second element
		studentToRemove.next = null; // make sure what we're removing doesn't point to anything
		numInQueue--;
		return studentToRemove;
	}
	
}
