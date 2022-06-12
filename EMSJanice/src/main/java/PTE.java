// PART TIME EMPLOYEE

public class PTE extends EmployeeInfo {
    
    
    public double hourlyWage;
    public double hoursPerWeek;
    public double weeksPerYear;
    
    
    public PTE(int eN, String fN, String lN, String g, String wL, double dR, double hW, double hPW, double wPY) {
        super(eN, fN, lN, g, wL, dR);
        hourlyWage = hW;
        hoursPerWeek = hPW;
        weeksPerYear = wPY;
        
    }
    
    public double getHourlyWage() {
        return hourlyWage;
    }
    public double getHoursPerWeek() {
        return hoursPerWeek;
    }
    public double getWeeksPerYear() {
        return weeksPerYear;
    }
    
    public double calcNetAnnualIncome() {
        return (hourlyWage *hoursPerWeek * weeksPerYear * (1.0 - deductRate));
    }
}
