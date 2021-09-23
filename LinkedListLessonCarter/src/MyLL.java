
public class MyLL {
	//attributes
	public int length;
	public StudentInfo frontOfList;
	
	//init function
	public MyLL() {
		length = 0;
		frontOfList = null;
	}
	
	//method - function of a class
	public void addToFront(StudentInfo newSnakeSegment) {
		if (frontOfList == null) { // list is empty
			length = 1;
			frontOfList = newSnakeSegment;	//Have theList point to the first element -> the newSnakeSegment		
			newSnakeSegment.next = null;    //Make sure it's not pointing to anything, since the list is just newSnakeSegment rn
			return;
		}
		// If list is not empty
		else {
			length++;
			newSnakeSegment.next = frontOfList;   //The newSegment points to the previous first place segment -> make sure Carter isn't orphaned
			frontOfList = newSnakeSegment;	 // theList points to the new first element -> the new snake segment
			return;			
		}
	}
	
	
	public void addToRear(StudentInfo newSnakeSegment) {
		if (frontOfList == null) { // list is empty
			length = 1;
			frontOfList = newSnakeSegment;		//Same as addToFront if the list is empty	
			newSnakeSegment.next = null;
			return;
		} 
		else {
			// more than one item
			StudentInfo currentStudent = frontOfList;
			for (int i = 1; i < length; i++) {
				System.out.println(currentStudent.firstName);
				currentStudent = currentStudent.next; // get ref of next student
			}
			
			currentStudent.next = newSnakeSegment;  //have the previous last element point to the newsnakesegment (aka the new last element)
			length++; //since we stiched another piece of flesh onto the snake, it grew in size
			return;
			
		}
	}
	
	
	
}
