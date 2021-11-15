public class PTE extends EmployeeInfo {
	// PART TIME
	
	public double hourlyWage;
	public double hoursPerWeek;
	public double weeksPerYear;
	
	public PTE(int eN, String fN, String lN, int g, int wL, double dR, double hW, double hPW, double wPY) {
		super(eN, fN, lN, g, wL, dR); // call constructor for employeeInfo
		hourlyWage = hW;
		hoursPerWeek = hPW;
		weeksPerYear = wPY;
	}
	
	public double calcGrossAnnualIncome() {
		return hourlyWage * hoursPerWeek * weeksPerYear;
	}
	
	public double calcNetAnnualIncome() {
		return hourlyWage * hoursPerWeek * weeksPerYear * (1.0 - deductRate);
	}
}
