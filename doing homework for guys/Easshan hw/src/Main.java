
public class Main {
	public static void main(String[] args) {
		
		MyStack theStack = new MyStack();
		StudentInfo theStudent;
		theStudent = new StudentInfo(345345, "Ari", "Liu", 162, 115);
		
		MyStack theS = new MyStack();
		MyQueue theQ = new MyQueue();
		
		
		StudentInfo someStudent;
		StudentInfo removedStudent;

		// QUEUE
		System.out.println("\n\nTESTING THE QUEUE STUFF");
		
		
		System.out.println("\nAbout to display the queue (front to rear)!");
		theQ.displayQueue();
		
		
		someStudent = new StudentInfo(111111, "Daffy", "Duck", 20, 10);
		theQ.enqueue(someStudent);
		
		someStudent = new StudentInfo(222222, "Pat", "Li", 20, 10);
		theQ.enqueue(someStudent);
		
		someStudent = new StudentInfo(333333, "Ari", "Liu", 20, 10);
		theQ.enqueue(someStudent);
		
		System.out.println("\nAbout to display the queue (front to rear)!");
		theQ.displayQueue();
		
		
		removedStudent = theQ.dequeue();
		if (removedStudent == null) {
			System.out.println("\ndequeued item is null");
		}
		else {
			System.out.println("\ndequeued item is " + removedStudent.firstName);
			System.out.println("attribute next has value " + removedStudent.next);
		}
		
		System.out.println("\nAbout to display the queue (front to rear)!");
		theQ.displayQueue();
		
		removedStudent = theQ.dequeue();
		if (removedStudent == null) {
			System.out.println("\ndequeued item is null");
		}
		else {
			System.out.println("\ndequeued item is " + removedStudent.firstName);
			System.out.println("attribute next has value " + removedStudent.next);
		}
		
		System.out.println("\nAbout to display the queue (front to rear)!");
		theQ.displayQueue();

		removedStudent = theQ.dequeue();
		if (removedStudent == null) {
			System.out.println("\ndequeued item is null");
		}
		else {
			System.out.println("\ndequeued item is " + removedStudent.firstName);
			System.out.println("attribute next has value " + removedStudent.next);
		}
		
		System.out.println("\nAbout to display the queue (front to rear)!");
		theQ.displayQueue();
		
		System.out.println(theQ.front);
		
		someStudent = new StudentInfo(111111, "Daffy", "Duck", 20, 10);
		theQ.enqueue(someStudent);
		System.out.println("\nAbout to display the queue (front to rear)!");
		theQ.displayQueue();
		
	}
}