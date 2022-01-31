
public class Main {
	public static void main(String[] args) {
		// Testing Student
		MyStudent theStudent;
		theStudent = new MyStudent();
		
//		System.out.println(theStudent.nextPerson);
		
//		theStudent.symbolToUse = "&";
//		theStudent.height = 97;
//		theStudent.weight = 60;
//		theStudent.drawHeight();				// Draws this to standard output:	&&&&&&&&&
//		System.out.println(theStudent.calcValue());		// Writes this to standard output:	63.77
//
//
//		theStudent.symbolToUse = "$";
//		theStudent.height = 89;
//		theStudent.weight = 45;
//		theStudent.drawHeight();				// Draws this to standard output:	$$$$$$$$
//		System.out.println(theStudent.calcValue());		// Writes this to standard output:	56.81
//
//
//		theStudent.symbolToUse = "*";
//		theStudent.height = 82;
//		theStudent.weight = 35;
//		theStudent.drawHeight();				// Draws this to standard output:	********
//		System.out.println(theStudent.calcValue());		// Writes this to standard output:	52.05

//		System.out.println("dsklfkldjfkldsjfklsdjklfjksdljfklsdjklfjsdlf");
//		
//		// Testing Teacher
		MyTeacher theTeacher;
		theTeacher = new MyTeacher("cat", 160, 45);
		
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
		
		theTeacher.nextPerson = theStudent; // set nextPerson attribute to theStudent
		System.out.println(theTeacher.nextPerson.calcValue());
		System.out.println(theTeacher.nextPerson);
		System.out.println(theTeacher.nextPerson.nextPerson);
		

	}
}