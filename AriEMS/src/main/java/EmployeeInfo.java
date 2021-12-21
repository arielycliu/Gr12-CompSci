
public class EmployeeInfo {
    // Attributes
    public int empNumber;
    public String firstName;
    public String lastName;
    public String gender;
    public String workLoc;
    public double deductRate;

    // Blank Constructors
    public EmployeeInfo() {
            this.empNumber = 0;
            this.firstName = "A";
            this.lastName = "L";
            this.gender = "";
            this.workLoc = "";
            this.deductRate = 0;
    }

    // Regular Constructors
    public EmployeeInfo(int empNumber, String firstName, String lastName, String gender, String workLoc, double deductRate) {
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
