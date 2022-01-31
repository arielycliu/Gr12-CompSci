
public class MyTeacher extends MyPerson {
	// Attributes
	public int teachSalary;
	
	// Constructor
	public MyTeacher(String symbolToUse, int height, int weight) { // takes three parameters
		super(symbolToUse, height, weight); // set main attributes, setting nextPerson to null
		this.teachSalary = 75000;  // initialize teachSalary as 75000
	}
	
	// Methods
	public double calcValue() { // take no input and return double
		if (height <= 0 || weight <= 0) { // if height or weight less than 0 return -1
			return -1;
		}
		// Otherwise, calculate 90% BMII
		double BMI = weight / Math.pow((height*0.01), 2); // java turns division of int < 1 into zero so avoid by using *0.01 instead
		return BMI*0.9; // return 90% of true BMI
	}
	
	public void drawHeight() { // take no input and return no value
		if (height <= 0) { // if less than 0, do nothing
			return;
		}
		int symbolCount = height/10; // round to tens
//		System.out.println(symbolCount);
		System.out.println(symbolToUse.repeat(symbolCount)); // draw out line of symbols, symbolCount number of times
		return;
	}
	
}
