
public class MyStudent extends MyPerson { // subclass of MyPerson
	
	// Constructor
	public MyStudent() { // no parameter
		super("@", 100, 50); // calling MyPerson constructor to set symbolToUse, height, weight, and nextPerson
	}
	
	// Methods
	public double calcValue() { // take no input and return double
		if (height <= 0 || weight <= 0) { // if height or weight less than 0 return -1, can't divide by 0
			return -1;
		}
		// Otherwise calculate BMI
		double BMI = weight / Math.pow((height*0.01), 2); // java turns division of int < 1 into zero so avoid by using *0.01 instead
		return BMI;
	}
	
	public void drawHeight() { // take no input and return no value
		if (height <= 0) { // if less than 0, do nothing
			return;
		}
		int symbolCount = height/10; // find the rounded height (round to ten)
//		System.out.println(symbolCount);
		System.out.println(symbolToUse.repeat(symbolCount)); // draw out line of symbols, symbolCount number of times
		return;

	}
}
