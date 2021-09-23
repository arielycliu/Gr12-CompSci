
public class Main {
	public static void main(String[] args) {
		
		MyLL theLL = new MyLL();
		StudentInfo theStudent;
		
		theStudent = new StudentInfo(123456, "Ari", "Liu");		
		theLL.addToFront(theStudent);
		
		theStudent = new StudentInfo(656789, "Jan", "An");
		theLL.addToRear(theStudent);
		
		theStudent = new StudentInfo(656789, "Pat", "Li");
		theLL.addToFront(theStudent);
		
		theLL.displayList();
		
		StudentInfo removedItem;
		removedItem = theLL.removeFromRear();
		
		if (removedItem != null) {
			System.out.println("Removed: " + removedItem.firstName);
		} else {
			System.out.println("CANNOT BE REMOVED, LIST IS EMPTY");
		}
		
		theLL.displayList();
		
	}
}
