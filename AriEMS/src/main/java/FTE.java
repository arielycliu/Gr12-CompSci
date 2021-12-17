
public class FTE extends EmployeeInfo{
    // Full time employee attributes
    private double yearlySalary;
    
    // Constructor
    public FTE(int eN, String fN, String lN, int g, int wL, double dR, double yS) {
        super(eN, fN, lN, g, wL, dR);
        yearlySalary = yS;
    }
    
    // Methods
    public double getYearlySalary() {
        return yearlySalary;
    }
     
    public double calcAnnualNetIncome() {
        return (yearlySalary *(1.0 - deductRate));
    }
}
