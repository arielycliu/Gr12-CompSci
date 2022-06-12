
import java.util.*;


public class MyHashTable {
	
	// ATTRIBUTES

	// buckets is an array of ArrayList.  Each item in an ArrayList is an EmployeeInfo object.
	public ArrayList<EmployeeInfo>[] buckets;
	public int numInHashTable;

	
	// CONSTRUCTOR

	public MyHashTable(int howManyBuckets) {
		// Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

		// Instantiate an array to have an ArrayList as each element of the array.
		buckets = new ArrayList[howManyBuckets];

		// For each element in the array, instantiate its ArrayList.
		for (int i = 0; i < howManyBuckets; i++) {
			buckets[i] = new ArrayList<EmployeeInfo>();  // Instantiate the ArrayList for bucket i.
		}
		
		numInHashTable = 0;
	}

	
	// METHODS
	
	public int getNumInHashTable() {
		return numInHashTable;
	}

	
	
	public int calcBucket(int keyValue) {
		// Returns the bucket number as the integer keyValue modulo the number of buckets for the hash table.
		return(keyValue % buckets.length);
	}
	

	
	public boolean addEmployee(EmployeeInfo theEmployee) {

		// Add the employee to the hash table.  Return true if employee is added successfully,
		// return false otherwise.
		
	} // end AddEmployee
	
	
	
	public int searchByEmployeeNumber(int employeeNum) {

		// Determine the position of the employee in the ArrayList for the bucket that that employee hashes to.
		// If the employee is not found, return -1.
		
	} // end searchByEmployeeNumber
	
	
	
	public void displayContents() {
	} // end displayContents

	
} // end MyHashTable
