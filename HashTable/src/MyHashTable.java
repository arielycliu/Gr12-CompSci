import java.util.*;


public class MyHashTable {
	
	// ATTRIBUTES

	// buckets is an array of ArrayList.  Each item in an ArrayList is an StudentInfo
	// object holding a reference value pointing to a student.

	public ArrayList<StudentInfo>[] buckets;

	
	// CONSTRUCTOR

	public MyHashTable(int howManyBuckets) {
		// Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

		// Instantiate buckets as an array to have an ArrayList as each element of the array.
		buckets = new ArrayList[howManyBuckets];

		// For each element in the array, instantiate its ArrayList.
		for (int i = 0; i < howManyBuckets; i++) {
			buckets[i] = new ArrayList();  // Instantiate the ArrayList for bucket i.
		}
	}


	// METHODS

	public int calcBucket(int studentNumber) {
		return(studentNumber % buckets.length);  // student number modulo number of buckets
	}


	public void addToTable(StudentInfo theStudent) {
		// Add the student referenced by theStudent to the hash table.
		int bucketNum = calcBucket(theStudent.studentNumber);
		buckets[bucketNum].add(theStudent);
		return;
		
	}


	public StudentInfo removeFromTable(int studentNumber) {
		// Remove that student from the hash table and return the reference value for that student.
		// Return null if that student isn't in the table.
		int bucketNum = calcBucket(studentNumber);
		StudentInfo someStudent;
		someStudent = new StudentInfo(123456, "Bugs", "Bunny", 40, 40);
		return someStudent;
	}

	
	public StudentInfo getFromTable(int studentNumber) {
		// Return the reference value for that student, return null if student isn't in the table.
	}


	public void displayTable() {
		// Walk through the buckets and display the items in each bucket's ArrayList.
	}


}
