    public class EmployeeInfo {
        
 
    // ATTRIBUTES
    public int empNum;
    public String firstName;
    public String lastName;
    public int gender; // encode e.g. 0 for M, 1 for F, etc.
    public int workLoc; // encode e.g. 0 for Mississauga, etc.
    public double deductRate; // e.g. 0.21 for 21%
    
   
    // CONSTRUCTORS
    
    public EmployeeInfo(int eN, String fN, String lN, int g, int wL, double dR) {
    	empNum = eN;
    	firstName = fN;
    	lastName = lN;
    	gender = g;
    	workLoc = wL;
    	deductRate = dR;
    }
    
    
    // METHODS
    
    public int geteN() {
    	return empNum;
    }
    
    public String getfN() {
    	return firstName;
    }
    
    public String getlN() {
    	return lastName;
    }
    //gender, location,deductrate
    public int getg(){
        return gender;
    }
     public int getwL(){
        return workLoc;
    } 
    public double getdR(){
        return deductRate;
    }
}
