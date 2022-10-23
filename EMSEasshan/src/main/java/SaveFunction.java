
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class SaveFunction {
    
    private MyHashTable theHT;
    
    public void saveData(MyHashTable theHT) throws IOException {
        File employeeData = new File("EMSDatabase.txt");
        if (employeeData.createNewFile()) {
            System.out.println("EMSDatabase file created.");
        } else {
            System.out.println("EMSDatabase file exists.");
        }
        
        FileWriter writer = new FileWriter("EMSDatabase.txt");
        // Save to file 
        for (int n = 0; n < theHT.buckets.length; n++) {    // loop thru each bucket 
            for (int m = 0; m < theHT.buckets[n].size(); m++) {     // loop thru each element in the ArrayList of each bucket
                EmployeeInfo employee = theHT.buckets[n].get(m); // get the current employee
                if (employee instanceof PTE) { 
                    PTE thePTE = (PTE) employee; 
                    writer.write("Part");
                    writer.write("," + thePTE.gethW());
                    writer.write("," + thePTE.gethPW());
                    writer.write("," + thePTE.getwPY() );
                } else if (employee instanceof FTE) { 
                    FTE theFTE = (FTE) employee; 
                    writer.write("Full");
                    writer.write("," + theFTE.getyS());
                }
                writer.write("," + employee.geteN());
                writer.write("," + employee.getfN());
                writer.write("," + employee.getlN());
                writer.write("," + employee.getdR() + "\n");
            }
        }
        // close file
        writer.close();
        System.out.println("Data saved to file.");
    }
    
    public MyHashTable loadData(MyHashTable theHT) throws FileNotFoundException, IOException { 
        
        File employeeData = new File("EMSDatabase.txt");
        if (employeeData.createNewFile()) {
            System.out.println("EMSDatabase file created.");
        } else {
            System.out.println("EMSDatabase file exists.");
        }
        
        File EMSDatabase = new File("EMSDatabase.txt");
        Scanner reader = new Scanner(EMSDatabase); // set up scanner
        
        if (reader instanceof Scanner) {
            System.out.println("File found. Loading previous data");
            while (reader.hasNextLine()) {
            // read each line
                String thisline = reader.nextLine();
                String[] splitLine = thisline.split(",");
                if (splitLine[0].equals("Full")) {
                    FTE FTEemployee = new FTE(Integer.parseInt(splitLine[2]), splitLine[3], splitLine[4], Double.parseDouble(splitLine[5]), Double.parseDouble(splitLine[1]));
                    theHT.addEmployee(FTEemployee);
                } else if (splitLine[1].equals("Part")) {
                    PTE PTEemployee = new PTE(Integer.parseInt(splitLine[4]), splitLine[5], splitLine[6], Double.parseDouble(splitLine[7]), Double.parseDouble(splitLine[1]), Double.parseDouble(splitLine[2]), Double.parseDouble(splitLine[3]));
                    theHT.addEmployee(PTEemployee);
                }
                theHT.numInHashTable++;
            }
            reader.close();
            return theHT;
        } else {
            System.out.println("File not found. Could not load previous data.");
            return theHT;
        }    
    }
}
