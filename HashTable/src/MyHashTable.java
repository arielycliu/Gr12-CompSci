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
		int bucketNum = calcBucket(theStudent.studentNumber); // find which bucket to place it in
		buckets[bucketNum].add(theStudent);
		return;
		
	}


	public StudentInfo removeFromTable(int studentNumber) {
		// Remove that student from the hash table and return the reference value for that student.
		// Return null if that student isn't in the table.
		
		int bucketNum = calcBucket(studentNumber);
		
		for (int i = 0; i < buckets[bucketNum].size(); i++) { // loop thru that bucket index, that arraylist
			if (buckets[bucketNum].get(i).studentNumber == studentNumber) { // check if it matches the student number
				StudentInfo removedStudent = buckets[bucketNum].get(i); // save the studentinfo ref val so we don't lose it
				buckets[bucketNum].remove(i);
				return removedStudent; // return if it does
			}
		}
		return null; // could not find student, return null
	}

	
	public StudentInfo getFromTable(int studentNumber) {
		// Return the reference value for that student, return null if student isn't in the table.
		int bucketNum = calcBucket(studentNumber);
		
		// check that bucketNum or bucket index for student with that studentNumber
		for (int i = 0; i < buckets[bucketNum].size(); i++) { // loop thru that bucket index, that arraylist
			// System.out.println(buckets[bucketNum].get(i));
			if (buckets[bucketNum].get(i).studentNumber == studentNumber) { // check if it matches the student number
				return buckets[bucketNum].get(i); // return if it does
			}
		}
		return null; // could not find student, return null
	}


	public void displayTable() {
		// Walk through the buckets and display the items in each bucket's ArrayList.
		System.out.println("##############################");
		for (int j = 0; j < buckets.length; j++) { // loop thru each bucket/arrayList
			System.out.println("~~~ Bucket " + j + " ~~~");
			for (int i = 0; i < buckets[j].size(); i++) { // loop thru each arrayList
				System.out.println(buckets[j].get(i).firstName);
			}
		}
		System.out.println("##############################");
		return;
	}


}
