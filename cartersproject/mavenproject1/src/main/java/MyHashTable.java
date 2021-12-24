
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
		
		if (theEmployee == null) {
			return(false);
		}
		else {
			int targetBucket = calcBucket(theEmployee.geteN());
			// Add the employee to the ArrayList for the targetBucket.
			boolean addStatus = buckets[targetBucket].add(theEmployee);
			numInHashTable++;
			return addStatus;
		}
		
	} // end AddEmployee
        public boolean removeEmployee(int theEmpNum){
            int bucketNum = calcBucket(theEmpNum);
            EmployeeInfo theEmployee = null;
            for (int i = 0; i < buckets[bucketNum].size(); i++){
                if (buckets[bucketNum].get(i).empNum == theEmpNum){
                    theEmployee = buckets[bucketNum].get(i);
                }
            }
            System.out.println(theEmployee);
            if(theEmployee == null){
                return(false);
            }
            else{
                boolean removeStatus = buckets[bucketNum].remove(theEmployee);
                numInHashTable++;
                return removeStatus;
            }
        }
	
	
	
	public EmployeeInfo searchByEmployeeNumber(int employeeNum) {

		// Determine the position of the employee in the ArrayList for the bucket that that employee hashes to.
		// If the employee is not found, return -1.
		
		int targetBucket = calcBucket(employeeNum);
		
		// Walk through the ArrayList and look for the employee.
		for (int j = 0; j < buckets[targetBucket].size(); j++) {
			if (employeeNum == buckets[targetBucket].get(j).geteN()) {
				return(buckets[targetBucket].get(j)); // The employee number is for the employee at position j in the target bucket's ArrayList.
			}			
		}
		
		return(null); // The employee number was not found for any employee in target bucket's ArrayList.
		
	} // end searchByEmployeeNumber
	
	
	
	public void displayContents() {
		
		System.out.println("\n\nDISPLAYING THE CONTENTS OF A HASH TABLE!");
		
		System.out.println("\n  This hash table contains " + numInHashTable + " entries.");
		
		// Print the employee numbers for the employees stored in each bucket's ArrayList,
		// starting with bucket 0, then bucket 1, and so on.
		
		for (int i = 0; i < buckets.length; i++) {

		    // For the current bucket, print out the emp num for each item
                    // in its ArrayList.

                    System.out.println("\n  Examining the ArrayList for bucket " + i);
                    int listSize = buckets[i].size();
                    if (listSize == 0) {
                    	System.out.println("    Nothing in its ArrayList!");
                    }
                    else {
                        for (int j = 0; j < listSize; j++) {
                           int theEmpNum = buckets[i].get(j).geteN();
                           System.out.println("    Employee " + theEmpNum);
                        }
                    }

                }

	} // end displayContents

	
} // end MyHashTable
