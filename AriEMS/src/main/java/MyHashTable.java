import java.util.*;

public class MyHashTable {
    // Attributes
    // bucket is array of ArrayList, each item in the bucket (ArrayList) is 
    // Empinfo object holding a ref val to an employee's data
    public ArrayList<EmployeeInfo>[] buckets; // array of ArrayList
    public int numInHashTable; 
    
    // Constructor
    public MyHashTable(int howManyBuckets) {
        // Construct the hash table as an array of howManyBuckets ArrayLists.
        // Instantiate buckets as an array to have an ArrayList as each element of the array.
        buckets = new ArrayList[howManyBuckets];

        // For each element in the array, instantiate its ArrayList.
        for (int i = 0; i < howManyBuckets; i++) {
            buckets[i] = new ArrayList<EmployeeInfo>();  // Instantiate the ArrayList for bucket i.
        }
        numInHashTable = 0;
    }
    
    // Methods
    public int getNumInHashTable() {
        return numInHashTable;
    }

    public int calcBucket(int empNumber) {
        return(empNumber % buckets.length);  // emp number modulo number of buckets
    }

    public EmployeeInfo searchByEmployeeNumber(int empNum) {
        int targetBucket = calcBucket(empNum); // calculate which bucket to search
        for (int i = 0; i < buckets[targetBucket].size(); i++) {    // loop thru that bucket's ArrayList
            if (buckets[targetBucket].get(i).getEmpNum() == empNum) {     // check if the element in the ArrayList has the same emp number
                return buckets[targetBucket].get(i); // return refval since it is found 
            }
        }
        return null; // the empNum doesn't already exist
    }
    
    public boolean addEmployee(EmployeeInfo theEmp) {
        // Add the student referenced by theEmp to the hash table.
        if (theEmp == null) {
            return false;
        }
        int bucketNum = calcBucket(theEmp.getEmpNum()); // find which bucket to place it in using it's emp number
        boolean addStatus = buckets[bucketNum].add(theEmp);
        numInHashTable++;
        return addStatus;
    }

    public EmployeeInfo removeFromTable(int empNumber) {
        // Remove that emp from the hash table and return the reference value for that emp.
        // Return null if that emp isn't in the table.

        int bucketNum = calcBucket(empNumber);    // find which bucket we saved that emp to

        for (int i = 0; i < buckets[bucketNum].size(); i++) {    // loop thru that bucket's ArrayList
            if (buckets[bucketNum].get(i).getEmpNum() == empNumber) {     // check if the element in the ArrayList has the same emp number
                EmployeeInfo removedEmployee = buckets[bucketNum].get(i);      // save the emp's reference value so we can return it
                buckets[bucketNum].remove(i);      // remove the emp
                numInHashTable--;
                return removedEmployee; // return the emp 
            }
        }
        return null; // could not find emp after checking the bucket, return null
    }

    public void displayTable() {
        // Walk through the buckets and display the items in each bucket's ArrayList.
        System.out.println("##############################");
        for (int j = 0; j < buckets.length; j++) {    // loop thru each bucket of the hash table
            System.out.println("~~~ Bucket #" + j + " ~~~");
            for (int i = 0; i < buckets[j].size(); i++) {     // loop thru each element in the ArrayList of each bucket
                System.out.println(buckets[j].get(i).getFirstName());
            }
        }
        System.out.println("##############################");
    }
}
