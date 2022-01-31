
public class Main {
	public static void main(String[] args) {
		// Testing Student
		MyStudent theStudent;
		theStudent = new MyStudent();
		
//		System.out.println(theStudent.symbolToUse);
//		theStudent.symbolToUse = "&";
//		theStudent.height = 97;
//		theStudent.weight = 60;
//		theStudent.drawHeight();
//		System.out.println(theStudent.calcValue());
		
		// Testing Teacher
		MyTeacher theTeacher;
		theTeacher = new MyTeacher(".", 180, 60);
		System.out.println(theTeacher.teachSalary);
		theTeacher.symbolToUse = "*";
		theTeacher.height = 104;
		theTeacher.weight = 72;
		theTeacher.drawHeight();				// Draws this to standard output:	**********
		System.out.println(theTeacher.calcValue());		// Writes this to standard output:	59.91


		theTeacher.symbolToUse = "#";
		theTeacher.height = 78;
		theTeacher.weight = 85;
		theTeacher.drawHeight();				// Draws this to standard output:	#######
		System.out.println(theTeacher.calcValue());		// Writes this to standard output:	125.74


		theTeacher.symbolToUse = "R";
		theTeacher.height = 106;
		theTeacher.weight = 47;
		theTeacher.drawHeight();				// Draws this to standard output:	RRRRRRRRRR
		System.out.println(theTeacher.calcValue());		// Writes this to standard output:	37.65

	}
}