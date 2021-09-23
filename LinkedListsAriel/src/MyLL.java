
public class MyLL {
	
	public int length;
	public StudentInfo frontOfList;
	
	
	public MyLL(){
		length = 0;
		frontOfList = null;
		
	}
	
	public StudentInfo removeFromFront() {
		if (frontOfList == null) {
			return null;
		}
		else { // list is not empty
			StudentInfo studentToRemove = frontOfList;
			frontOfList = studentToRemove.next;  // set front of list to the next list item
			studentToRemove.next = null; // set the item to remove next to null, so it's not pointing at anything
			length--;
			//System.out.println("\n*REMOVED FROM FRONT*");
			return studentToRemove;
		}
	}
	
	public StudentInfo removeFromRear() {
		if (frontOfList == null) {
			return null;
		}
		else {
			// Find the second last element
			StudentInfo findSecondLast = frontOfList;
			for (int i = 1; i < length-1; i++) {
				findSecondLast = findSecondLast.next;
			}
			//System.out.println("Second Last: " + findSecondLast.firstName);
			StudentInfo studentToRemove = findSecondLast.next; // set studentToRemove to last student
			
			findSecondLast.next = null; // set second last element to null so it's not pointing to last
			length--;
			return studentToRemove;	
			
		}
		
	}
	
	public void addToRear(StudentInfo studentToAdd) {
		if (frontOfList == null) { // if list is empty just add
			studentToAdd.next = null;
			frontOfList = studentToAdd;
			length = 1;
			return;
		}
			
		// multiple items have to "scroll" to end
		StudentInfo currentStudent = frontOfList;
		
		while (currentStudent.next != null) {
			System.out.println(currentStudent.firstName);
			currentStudent = currentStudent.next;
		}
		
		// when is finds the last element add it to the rear
		currentStudent.next = studentToAdd;
		length++;
		System.out.println("\n*ADDED TO REAR*");
		return;
			
	}
	
	public void addToFront(StudentInfo studentToAdd) {
		if (frontOfList == null) {
			studentToAdd.next = null; //just in case kay
			frontOfList = studentToAdd;
			length = 1;
			System.out.println("\n*ADDED TO FRONT*");
			return;
					
		}
		// more than one item
		studentToAdd.next = frontOfList;
		frontOfList = studentToAdd;
		length++;
		return;
	}
	
	public void displayList() {
		if (frontOfList == null) { // list is empty
			System.out.println("\nEMPTY LIST");
			return;
		}
		System.out.println("\nWe have " + length + " elements: ");
		StudentInfo currentStudent = frontOfList;
		
		// loop thru to print names
		for (int i = 0; i < length; i++) {
			System.out.println(currentStudent.firstName);
			currentStudent = currentStudent.next;
		}
		return;
	}

}
