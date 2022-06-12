// FULL TIME EMPLOYEE

public class FTE extends EmployeeInfo {

    private double yearlySalary;
    
    public FTE(int eN, String fN, String lN, String g, String wL, double dR, double yS) {
        super(eN, fN, lN, g, wL, dR);
        yearlySalary = yS;
        
    }
    
    
    public double getYearlySalary() {
        return yearlySalary;
    }
    
    
    public double calcNetAnnualIncome() {
        return (yearlySalary *(1.0 - deductRate));
    }
    
}
