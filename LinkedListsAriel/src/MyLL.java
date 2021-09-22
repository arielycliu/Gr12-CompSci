
public class MyLL {
	
	public int length;
	public StudentInfo frontOfList;
	
	
	public MyLL(){
		length = 0;
		frontOfList = null;
		
	}
	
	public void addToRear(StudentInfo studentToAdd) {
		if (frontOfList == null) { // if list is empty just add
			studentToAdd.next = null;
			frontOfList = studentToAdd;
			length = 1;
			return;
		}
			
		// multiple items have to "scroll" to end
		System.out.println("\nScrolling to end: ");
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
