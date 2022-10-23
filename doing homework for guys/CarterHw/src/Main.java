import java.util.*;

public class Main {
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	     int num = input.nextInt();
//	     System.out.println(num);
	     int totalSpaces = num * 2;
	     
	     for (int n = num; n > 0; n--) {
	    	 int spacesInLine = totalSpaces - (num-n);
	    	 String spacesOfLine = String.format("%"+spacesInLine+"s", "");
	    	 System.out.print(spacesOfLine);
	    	 for (int j = n; j < num+1; j++) {
	    		 System.out.print(j);
	    	 }n
	    	 System.out.println("");
	     }
	     
	     for (int n = 2; n < num+1; n++) {
	    	 int spacesInLine = totalSpaces - (num-n);
	    	 String spacesOfLine = String.format("%"+spacesInLine+"s", "");
	    	 System.out.print(spacesOfLine);
	    	 for (int j = n; j < num+1; j++) {
	    		 System.out.print(j);
	    	 }
	    	 System.out.println("");
	     }
	    		 
	 }

}
