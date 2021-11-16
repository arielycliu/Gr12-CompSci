
public class FTE extends EmployeeInfo {
	
	// FULL TIME
	
	public double salary;
	
	public FTE(int eN, String fN, String lN, int g, int wL, double dR, int s) {
		super(eN, fN, lN, g, wL, dR); // call constructor for employeeInfo
		salary = s;
	}
	
	public double calcGrossAnnualIncome() {
		return salary;
	}
	
	public double calcNetAnnualIncome() {
		return salary * (1.0 - deductRate);
	}
}
