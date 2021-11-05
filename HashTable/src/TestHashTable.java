
public class TestHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentInfo someStudent;
		StudentInfo removedStudent;
		
		MyHashTable theHT = new MyHashTable(10);  // Open hash table with 10 buckets
		
//		theHT.displayTable();
		
		someStudent = new StudentInfo(111111, "Bugs", "Bunny", 40, 40);
		theHT.addToTable(someStudent);
		
		someStudent = new StudentInfo(111112, "Lola", "Bunny", 40, 40);
		theHT.addToTable(someStudent);
		
		someStudent = new StudentInfo(111113, "Daffy", "Duck", 40, 40);
		theHT.addToTable(someStudent);
		
		someStudent = new StudentInfo(111114, "Pat", "Duck", 40, 40);
		theHT.addToTable(someStudent);
		
		someStudent = new StudentInfo(111115, "Jan", "Duck", 40, 40);
		theHT.addToTable(someStudent);
		
		someStudent = new StudentInfo(111116, "Ari", "Duck", 40, 40);
		theHT.addToTable(someStudent);
		
		someStudent = new StudentInfo(111117, "Fan", "Duck", 40, 40);
		theHT.addToTable(someStudent);
		
		someStudent = new StudentInfo(111118, "Dan", "Duck", 40, 40);
		theHT.addToTable(someStudent);
		
		someStudent = new StudentInfo(111119, "Tan", "Duck", 40, 40);
		theHT.addToTable(someStudent);
		
		someStudent = new StudentInfo(111120, "Han", "Duck", 40, 40);
		theHT.addToTable(someStudent);
		
		someStudent = new StudentInfo(111120, "Han2", "Duck", 40, 40);
		theHT.addToTable(someStudent);

		someStudent = theHT.getFromTable(111111);
		if (someStudent != null) {
			System.out.println(someStudent.firstName);
		}
		else {
			System.out.println(someStudent);
		}
		
		// do we need to check that student numbers are unique?
		someStudent = theHT.removeFromTable(111120);
		if (someStudent != null) {
			System.out.println(someStudent.firstName);
		}
		else {
			System.out.println(someStudent);
		}
		
		someStudent = theHT.removeFromTable(111120);
		if (someStudent != null) {
			System.out.println(someStudent.firstName);
		}
		else {
			System.out.println(someStudent);
		}
		
//		theHT.displayTable();
		

	}

}
