
import java.lang.Math;

public class TheMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		StudentInfo someStudent = new StudentInfo();
		*/
		//StudentInfo someStudent = new StudentInfo(222222, "Daffy", "Duck");
		StudentInfo someStudent = new StudentInfo();
		System.out.println(someStudent + "\\"); // reference value
		
		
		
		System.out.println("The student number is " + someStudent.studentNumber);
		System.out.println("The first name is " + someStudent.firstName);
		System.out.println("The last name is " + someStudent.lastName + "\n");
		System.out.println("The height is " + someStudent.height + "\n");
		System.out.println("The weight is " + someStudent.weight + "\n");
		
		someStudent.studentNumber = 111111;
		someStudent.firstName = "Bugs";
		someStudent.lastName = "Bunny";
		someStudent.height = 1.83;
		someStudent.weight = 100;

		System.out.println("The student number is " + someStudent.studentNumber);
		System.out.println("The first name is " + someStudent.firstName);
		System.out.println("The last name is " + someStudent.lastName + "\n");
		System.out.println("The height is " + someStudent.height + "\n");
		System.out.println("The weight is " + someStudent.weight + "\n");
		System.out.println("The BMI is " + someStudent.calcBMI()); // calling method

		
		StudentInfo someOtherStudent = new StudentInfo(222222, "Daffy", "Duck", 1.05, 20.5);
		
		System.out.println("The student number is " + someOtherStudent.studentNumber);
		System.out.println("The first name is " + someOtherStudent.firstName);
		System.out.println("The last name is " + someOtherStudent.lastName + "\n");
		System.out.println("The height is " + someOtherStudent.height + "\n");
		System.out.println("The weight is " + someOtherStudent.weight + "\n");
		System.out.println("The BMI is " + someOtherStudent.calcBMI());
		double someBMI = someOtherStudent.calcBMI();
		
		someStudent.stuff();
		
		
		someStudent = someOtherStudent;
		System.out.println("someStudent now has studentNumber " + someStudent.studentNumber);
		someStudent.doSomething("Mr. Dutton");
		
		System.out.println(Math.sin(1.57));
		

	}

}
