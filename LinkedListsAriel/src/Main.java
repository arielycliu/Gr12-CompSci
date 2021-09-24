
public class Main {
	public static void main(String[] args) {
		
		MyLL theLL = new MyLL();
		StudentInfo theStudent;
		
		theStudent = new StudentInfo(14353, "Ari", "Liu");		
		theLL.addToFront(theStudent);
		
		theStudent = new StudentInfo(25493402, "Jan", "An");
		theLL.addToRear(theStudent);
		
		theStudent = new StudentInfo(345453, "Pat", "Li");
		theLL.addToRear(theStudent);
		
		theStudent = new StudentInfo(345344, "Jojo", "Zou");
		theLL.addToRear(theStudent);
		
		int index = theLL.searchByStudentNumber(345344);
		
		if (index != -1) {
			System.out.println(theLL.getInfo(index).firstName);
		} else {
			System.out.println("NUMBER NOT FOUND");
		}
		

		//theLL.displayList();
		
//		StudentInfo removedItem;
//		removedItem = theLL.removeFromRear();
//		
//		if (removedItem != null) {
//			System.out.println("\nRemoved: " + removedItem.firstName);
//		} else {
//			System.out.println("\nCANNOT BE REMOVED, LIST IS EMPTY");
//		}
//		
//		theLL.displayList();
		
	}
}
