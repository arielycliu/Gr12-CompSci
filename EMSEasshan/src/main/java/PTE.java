// PART TIME EMPLOYEE

public class PTE extends EmployeeInfo {
    
    
    public double hourlyWage;
    public double hoursPerWeek;
    public double weeksPerYear;
    
    
    public PTE(int eN, String fN, String lN, double dR, double hW, double hPW, double wPY) {
        super(eN, fN, lN, dR);
        hourlyWage = hW;
        hoursPerWeek = hPW;
        weeksPerYear = wPY;
        
    }
    
    public double gethW() {
        return hourlyWage;
    }
    public double gethPW() {
        return hoursPerWeek;
    }
    public double getwPY() {
        return weeksPerYear;
    }
    
    public double calcAnnual() { // calculate net annual income
        return (hourlyWage *hoursPerWeek * weeksPerYear * (1.0 - deductRate));
    }
}
