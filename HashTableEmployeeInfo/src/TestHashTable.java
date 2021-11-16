
public class TestHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PTE somePTE;
		FTE someFTE;
		EmployeeInfo removedEmp;
		EmployeeInfo getEmp;
		
		MyHashTable theHT = new MyHashTable(10);  // Open hash table with 10 buckets
		
//		theHT.displayTable();
		
		somePTE = new PTE(111111, "Bugs", "Bunny", 0, 3, 0.25, 22.50, 25, 40.0);
		theHT.addToTable(somePTE);
		
		someFTE = new FTE(111112, "Lola", "Bunny", 1, 5, 0.27, 120000.0);
		theHT.addToTable(someFTE);
		
		somePTE = new PTE(111113, "Daffy", "Duck", 0, 2, 0.18, 17.0, 20.0, 25.0);
		theHT.addToTable(somePTE);
		
		theHT.displayTable();
		
		removedEmp = theHT.removeFromTable(111111);
		
		if (removedEmp == null) {
			System.out.println("Remove unsucessful. Employee number could not be found.");
		}
		else {
			System.out.println("Removed " + removedEmp.firstName);
			if (removedEmp instanceof FTE) { // check if it's an instance of full time or part time
				FTE removedFTE = (FTE) removedEmp; // casting the removedEmp ref value as a FTE
				System.out.println("Salary: " + removedFTE.salary);
				System.out.println("Net annual income: " + removedFTE.calcNetAnnualIncome());
			}
			else if (removedEmp instanceof PTE) {
				PTE removedPTE = (PTE) removedEmp;  // casting the removedEmp ref val as PTE ref val
				System.out.println("Hourly wage: " + removedPTE.hourlyWage);
				System.out.println("Net annual income: " + removedPTE.calcNetAnnualIncome());	
			}
		}
		
		theHT.displayTable();

		getEmp = theHT.getFromTable(111111);
		if (getEmp != null) {
			System.out.println(getEmp.firstName);
		}
		else {
			System.out.println(getEmp);
		}

		
		

	}

}
