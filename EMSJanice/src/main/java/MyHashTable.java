
import java.util.*;


public class MyHashTable {
	
	// ATTRIBUTES

	// buckets is an array of ArrayList.  Each item in an ArrayList is an EmployeeInfo object.
	public ArrayList<EmployeeInfo>[] buckets;
	public int numInHashTable = 0;

	
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
                return false;
            }
            int bucketNum = calcBucket(theEmployee.getEmpNum()); // find bucket num
            numInHashTable++;
            return buckets[bucketNum].add(theEmployee);
	} // end AddEmployee
	
        
        public boolean removeEmployee(int employeeNum) {
            int bucketNum = calcBucket(employeeNum);    // find which bucket we saved that emp to

            for (int i = 0; i < buckets[bucketNum].size(); i++) {    // loop thru that bucket's ArrayList
                if (buckets[bucketNum].get(i).getEmpNum() == employeeNum) {     // check if the element in the ArrayList has the same emp number
                    buckets[bucketNum].remove(i);      // remove the emp
                    numInHashTable--;
                    return true; // sucessful 
                }
            }
            return false; // failed in task
	} // end AddEmployee
	
	
	public EmployeeInfo searchByEmployeeNumber(int employeeNum) {
            int targetB = calcBucket(employeeNum);
            for (int j = 0; j < buckets[targetB].size(); j++) {
                if (buckets[targetB].get(j).getEmpNum() == employeeNum) {
                    return(buckets[targetB].get(j)); // return ref val when found
                }			
            }
            return null;          
	} // end searchByEmployeeNumber
	
	
	
	public void displayContents() {
            System.out.println("\n  This hash table contains " + numInHashTable + " entries.");
            for (int j = 0; j < buckets.length; j++) {    // loop thru each bucket 
                System.out.println("Bucket number: " + j);
                for (int i = 0; i < buckets[j].size(); i++) {     // loop thru each element in the ArrayList of each bucket
                    System.out.println(buckets[j].get(i).getFirstName());
                }
            }
	} // end displayContents

	
} // end MyHashTable
