
import java.util.*;


public class MyHashTable {
	
	// ATTRIBUTES

	// buckets is an array of ArrayList.  Each item in an ArrayList is an EmployeeInfo object.
	public ArrayList<EmployeeInfo>[] buckets;
	public int numInHashTable = 0;

	// CONSTRUCTOR
	public MyHashTable(int bucketCount) {
            // Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

            // Instantiate an array to have an ArrayList as each element of the array.
            buckets = new ArrayList[bucketCount];

            // For each element in the array, instantiate its ArrayList.
            for (int i = 0; i < bucketCount; i++) {
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
	
	public boolean addEmployee(EmployeeInfo emp) {
            // Add the employee to the hash table.  Return true if employee is added successfully,
            // return false otherwise.
            if (emp == null) {
                return false;
            }
            int bucketNum = calcBucket(emp.geteN()); 
            numInHashTable++;
            return buckets[bucketNum].add(emp);
	} 
        
        public boolean removeEmployee(int eN) {
            int bucket = calcBucket(eN);    
            for (int n = 0; n < buckets[bucket].size(); n++) {   
                if (buckets[bucket].get(n).geteN() == eN) { // find matching eN number
                    buckets[bucket].remove(n);    
                    numInHashTable--; // count down
                    return true;  
                }
            }
            return false;
	} 
	
	public EmployeeInfo searchByEmployeeNumber(int eN) {
            int bucket = calcBucket(eN);
            for (int n = 0; n < buckets[bucket].size(); n++) {
                if (buckets[bucket].get(n).geteN() == eN) {
                    return(buckets[bucket].get(n)); // ref value
                }			
            }
            return null;          
	} 
	
	public void displayContents() {
            for (int n = 0; n < buckets.length; n++) {    // loop thru each bucket 
                System.out.println("Bucket: " + n);
                for (int m = 0; m < buckets[n].size(); m++) {     // loop thru each element in the ArrayList of each bucket
                    System.out.println(buckets[n].get(m).getfN());
                }
            }
	} 	
} 
