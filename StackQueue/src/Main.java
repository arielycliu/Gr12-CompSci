
public class Main {
	public static void main(String[] args) {
		
		MyStack theStack = new MyStack();
		StudentInfo theStudent;
		theStudent = new StudentInfo(345345, "Ari", "Liu", 162, 115);
		
		MyStack theS = new MyStack();
		MyQueue theQ = new MyQueue();
		
		
		StudentInfo someStudent;
		StudentInfo removedStudent;
		
		
// STACK
		System.out.println("\n\nTESTING THE STACK STUFF");
		
		System.out.println("\nAbout to display the stack (top to bottom)!");
		theS.displayStack();
				
		someStudent = new StudentInfo(111111, "Daffy", "Duck", 20, 10);
		theS.push(someStudent);

		System.out.println("\nAbout to display the stack (top to bottom)!");
		theS.displayStack();
		
		removedStudent = theS.pop();
		if (removedStudent == null) {
			System.out.println("\npopped item is null");
		}
		else {
			System.out.println("\npopped item is " + removedStudent.firstName);
			System.out.println("attribute next has value " + removedStudent.next);
		}
		System.out.println("\nAbout to display the stack (top to bottom)!");
		theS.displayStack();
		
	}
}
