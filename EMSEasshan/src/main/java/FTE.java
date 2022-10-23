// FULL TIME EMPLOYEE

public class FTE extends EmployeeInfo {

    private double yearlySalary;
    
    public FTE(int eN, String fN, String lN, double dR, double yS) {
        super(eN, fN, lN, dR);
        yearlySalary = yS;
        
    }
    
    
    public double getyS() {
        return yearlySalary;
    }
    
    
    public double calcAnnual() { // calculate net annual income
        return (yearlySalary *(1.0 - deductRate));
    }
    
}
