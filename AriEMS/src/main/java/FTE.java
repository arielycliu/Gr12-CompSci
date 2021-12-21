
public class FTE extends EmployeeInfo{
    // Full time employee attributes
    private double yearlySalary;
    
    // Constructor
    public FTE(int eN, String fN, String lN, String g, String wL, double dR, double yS) {
        super(eN, fN, lN, g, wL, dR);
        yearlySalary = yS;
    }
    
    // Methods
    public double getYearlySalary() { //calcGrossAnnualIncome
        return yearlySalary;
    }
     
    public double calcNetAnnualIncome() { 
        return (yearlySalary *(1.0 - deductRate));
    }
}
