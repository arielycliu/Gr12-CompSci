
public class EmployeeInfo {
    // Attributes
    public int empNumber;
    public String firstName;
    public String lastName;
    public int gender;
    public int workLoc;
    public double deductRate;

    // Blank Constructors
    public EmployeeInfo() {
            this.empNumber = 0;
            this.firstName = "A";
            this.lastName = "L";
            this.gender = 0;
            this.workLoc = 0;
            this.deductRate = 0;
    }

    // Regular Constructors
    public EmployeeInfo(int empNumber, String firstName, String lastName, int gender, int workLoc, double deductRate) {
            this.empNumber = empNumber;
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
            this.workLoc = workLoc;
            this.deductRate = deductRate;
    }
    // Gettor
    public int getEmpNum(){
        return empNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}
