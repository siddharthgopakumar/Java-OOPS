
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import org.apache.commons.csv.*; //CSV Library
public class Part1 {
public CSVRecord coldestHourInFile(CSVParser parser) //CSVParser is the handle to get data from CSV file.
{
    CSVRecord coldestRow = null;            //CSVRecord helps us accessindividual data values.
    for( CSVRecord currentRow : parser)
    {
        if ( coldestRow == null)           //Checking if coldestRow is null, if so then we will assign currentRow to coldestRow.
        {
            coldestRow = currentRow;
        }
        else
        {
            double coldestTemp = Double.parseDouble(coldestRow.get("TemperatureF"));   //Converting string to double using Double.parseDouble()
            double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
            if ( coldestTemp > currentTemp && currentTemp != -9999) //Checking if coldestTemp is greater than currentTemp, if so coldestTemp will be update with currentTemp. Also using && operator ignoring bogus values(-9999).
            {
                coldestRow = currentRow;
            }
        }
    }
    return coldestRow; //Returning the coldest temparture containing row(A CSVRecord object).
}
public void testcoldestHourInFile()
{
    FileResource fr = new FileResource(); //Opeing the file. Since we didn't mention the file name a terminal will be opened and the we can open a file from terminal.
    CSVRecord coldest = coldestHourInFile(fr.getCSVParser()); // Method call.
    System.out.println("Coldest temperature is " + coldest.get("TemperatureF") + ". Time of Occurence is " + coldest.get("DateUTC")); //Printing the result using .get(columnname). .get() is a method of CSVRecord class.
}
}
