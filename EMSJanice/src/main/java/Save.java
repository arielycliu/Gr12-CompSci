import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Save {
    
    private MyHashTable theHT;
    
    public void writeToFile(MyHashTable theHT) throws IOException {
        newFile(); // creates file if it doesn't exist
        FileWriter theWriter = new FileWriter("Data.txt");
        // Writing 
        for (int j = 0; j < theHT.buckets.length; j++) {    // loop thru each bucket 
            for (int i = 0; i < theHT.buckets[j].size(); i++) {     // loop thru each element in the ArrayList of each bucket
                EmployeeInfo employee = theHT.buckets[j].get(i);
                theWriter.write("" + employee.getEmpNum());
                theWriter.write("," + employee.getFirstName());
                theWriter.write("," + employee.getLastName());
                theWriter.write("," + employee.getGender());
                theWriter.write("," + employee.getWorkLoc());
                theWriter.write("," + employee.getDeductRate());
                if (employee instanceof PTE) { // if PTE
                    PTE thePTE = (PTE) employee; // caste into PTE
                    theWriter.write(",PTE");
                    theWriter.write("," + thePTE.getHourlyWage());
                    theWriter.write("," + thePTE.getHoursPerWeek());
                    theWriter.write("," + thePTE.getWeeksPerYear() + "\n");
                } else if (employee instanceof FTE) { // if FTE
                    FTE theFTE = (FTE) employee; // cast into FTE
                    theWriter.write(",FTE");
                    theWriter.write("," + theFTE.getYearlySalary() + "\n");
                }
            }
        }
        // Writing end
        theWriter.close();
        System.out.println("Successfully saved data.");
    }
    
    public MyHashTable readFile() { 
        try {
            // run on main startup
            theHT = new MyHashTable(10); // create hashtable
            newFile();
            File data = new File("Data.txt");
            Scanner reader = new Scanner(data);

            while (reader.hasNextLine()) {
                // loop line by line, each line is an employee
                String thisline = reader.nextLine();
                String[] splitLine = thisline.split(","); // split using commas
                if (splitLine[6].equals("PTE")) {
                    PTE PTEemployee = new PTE(Integer.parseInt(splitLine[0]), splitLine[1], splitLine[2], splitLine[3], splitLine[4], Double.parseDouble(splitLine[5]), Double.parseDouble(splitLine[7]), Double.parseDouble(splitLine[8]), Double.parseDouble(splitLine[9]));
                    theHT.addEmployee(PTEemployee);
                } else if (splitLine[6].equals("FTE")) {
                    FTE FTEemployee = new FTE(Integer.parseInt(splitLine[0]), splitLine[1], splitLine[2], splitLine[3], splitLine[4], Double.parseDouble(splitLine[5]), Double.parseDouble(splitLine[7]));
                    theHT.addEmployee(FTEemployee);
                }
                theHT.numInHashTable++;
                theHT.displayContents();
            }
            reader.close();
            return theHT;            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Save.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void newFile() {
        try {
            File employeeData = new File("Data.txt");
            if (employeeData.createNewFile()) {
                System.out.println("Data file created.");
            } else {
                System.out.println("Data file exists.");
            }
        } catch (IOException ex) {
            Logger.getLogger(Save.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
