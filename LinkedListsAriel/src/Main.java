
public class Main {
	public static void main(String[] args) {
		
		MyLL theLL = new MyLL();
		StudentInfo theStudent;
		
		theStudent = new StudentInfo(123456, "Ari", "Liu");		
		theLL.addToFront(theStudent);
		theLL.displayList();
		
		theStudent = new StudentInfo(656789, "Jan", "An");
		theLL.addToRear(theStudent);
		theLL.displayList();
		
		theStudent = new StudentInfo(656789, "Pat", "Li");
		theLL.addToFront(theStudent);
		theLL.displayList();
		
		
	}
}
