
public class TestHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentInfo someStudent;
		StudentInfo removedStudent;
		
		MyHashTable theHT = new MyHashTable(10);  // Open hash table with 10 buckets
		
//		theHT.displayTable();
//		
		someStudent = new StudentInfo(123456, "Bugs", "Bunny", 40, 40);
		theHT.addToTable(someStudent);
		
		someStudent = new StudentInfo(987654, "Lola", "Bunny", 40, 40);
		theHT.addToTable(someStudent);
		
		someStudent = new StudentInfo(464646, "Daffy", "Duck", 40, 40);
		theHT.addToTable(someStudent);

//		theHT.displayTable();

	}

}
