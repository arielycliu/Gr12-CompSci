
public class Main {
	public static void main(String[] args) {
				
		StudentInfo Carter; //preparing 
		Carter = new StudentInfo(); //set to default values
		//System.out.println(Carter.next);
		
		StudentInfo Ari;
		Ari = new StudentInfo(2, "Ariel");
		//System.out.println(Ari.next);
		
		
		// ADD TO FRONT
		MyLL theList = new MyLL();
		theList.addToFront(Carter);
		
		theList.addToFront(Ari);
		
		StudentInfo Daniel;
		Daniel = new StudentInfo(3, "Daniel");
		
		// ADD TO REAR
		theList.addToRear(Daniel);
		
	}
}
