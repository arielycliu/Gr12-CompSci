/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ariel
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SaveEmployee {
    // Attributes
    private MyHashTable theHT;
    private int empNumber;
    private String firstName;
    private String lastName;
    private String gender;
    private String workLoc;
    private double deductRate;
    private double hourlyWage;
    private double hoursPerWeek;
    private double weeksPerYear;
    private double yearlySalary; // FTE
    
    private String empType;
    
    public MyHashTable readData(){
        theHT = new MyHashTable(10); // create hashtable to save data to
        try {
            File thefile = new File("EmployeeDatabase.txt");
            Scanner theReader = new Scanner(thefile);
            if (thefile.length() == 0) {
                System.out.println("No data to read");
                theHT = new MyHashTable(10); // init the hashtabl we'll be using with 10 buckets
                return theHT;
            }
            while (theReader.hasNextLine()) { // will loop thru entire file
                String lineData = theReader.nextLine(); // reads the next line
                String[] splitedData = lineData.split(": ");
                if (splitedData[0].equals("EmpNum")) {
                    empNumber = Integer.parseInt(splitedData[1]);
                } else if (splitedData[0].equals("fN")) {
                    firstName = splitedData[1];
                } else if (splitedData[0].equals("lN")) {
                    lastName = splitedData[1];
                } else if (splitedData[0].equals("gender")) {
                    gender = splitedData[1];
                } else if (splitedData[0].equals("workLoc")) {
                    workLoc = splitedData[1];
                } else if (splitedData[0].equals("deductRate")) {
                    deductRate = Double.parseDouble(splitedData[1]);
                } else if (splitedData[0].equals("type")) {
                    empType = splitedData[1];
                } else if (splitedData[0].equals("hourlyWage")) {
                    hourlyWage = Double.parseDouble(splitedData[1]);
                } else if (splitedData[0].equals("hoursPerWeek")) {
                    hoursPerWeek = Double.parseDouble(splitedData[1]);
                } else if (splitedData[0].equals("weeksPerYear")) {
                    weeksPerYear = Double.parseDouble(splitedData[1]);
                    PTE newPTE; // since last data needed we can add to hashtable now
                    newPTE = new PTE(empNumber, firstName, lastName, gender, workLoc, deductRate, hourlyWage, hoursPerWeek, weeksPerYear);
                    theHT.addEmployee(newPTE);   
                } else if (splitedData[0].equals("yearlySalary")) {
                    yearlySalary = Double.parseDouble(splitedData[1]);
                    FTE newFTE; // since last data needed we can add to hashtable now
                    newFTE = new FTE(empNumber, firstName, lastName, gender, workLoc, deductRate, yearlySalary);
                    theHT.addEmployee(newFTE);
                }
            }
            theReader.close();
            return theHT;
        } catch (FileNotFoundException e) {
            System.out.println("No previous data found"); // file does not exist
            theHT = new MyHashTable(10); // init the hashtabl we'll be using with 10 buckets
            return theHT;
        }
    }
    
    public boolean saveData(MyHashTable refval){ // run function whenever changes made
        theHT = refval;
        createFile(); // will create file if doesn't already exist
        try {
            FileWriter theWriter = new FileWriter("EmployeeDatabase.txt");
            // Writing starts
            for (int j = 0; j < theHT.buckets.length; j++) {    // loop thru each bucket of the hash table
                for (int i = 0; i < theHT.buckets[j].size(); i++) {     // loop thru each element in the ArrayList of each bucket
                    EmployeeInfo curEmp = theHT.buckets[j].get(i);
                    theWriter.write("EmpNum: " + curEmp.getEmpNum() + "\n");
                    theWriter.write("fN: " + curEmp.getFirstName() + "\n");
                    theWriter.write("lN: " + curEmp.getLastName() + "\n");
                    theWriter.write("gender: " + curEmp.getGender() + "\n");
                    theWriter.write("workLoc: " + curEmp.getWorkLoc() + "\n");
                    theWriter.write("deductRate: " + curEmp.getDeductRate() + "\n");
                    if (curEmp instanceof PTE) { // if PTE write PTE attributes
                        PTE curPTE = (PTE) curEmp; // turn from EmpInfo to PTE type
                        theWriter.write("type: PTE\n");
                        theWriter.write("hourlyWage: " + curPTE.hourlyWage + "\n");
                        theWriter.write("hoursPerWeek: " + curPTE.hoursPerWeek + "\n");
                        theWriter.write("weeksPerYear: " + curPTE.weeksPerYear + "\n");
                    } else if (curEmp instanceof FTE) { // if FTE write FTE attributes
                        FTE curFTE = (FTE) curEmp; // turn from EmpInfo to FTE type
                        theWriter.write("type: FTE\n");
                        theWriter.write("yearlySalary: " + curFTE.yearlySalary + "\n");
                    }
                }
            }
            // Writing end
            theWriter.close();
            System.out.println("Successfully saved data.");
        } catch (IOException e) {
            System.out.println("Error: ");
            e.printStackTrace();
        }
        
        return true;
    }
    
    public void createFile(){
        try {
            File newfile = new File("EmployeeDatabase.txt");
            if (newfile.createNewFile()) {
                System.out.println("File successfully created: " + newfile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error:");
            e.printStackTrace();
        }
        return;
    }
    

}
