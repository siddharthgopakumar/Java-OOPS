
/**
 * This program calculates the lowest temperature for a range of files. And returns the name of the file. The whole program algorithm is divided into three functions.
 * the first function coldestRowUpdation() helps us in determining if the current row from the file in picture has the lowest temperature or not.
 * The function coldestHourInFile() finds the lowest temperature in one file and for row comparison uses coldestRowUpdation() function.
 * The coldestInManyDays() finds the lowest temperature for a range of days(goes through multiple files. The coldestInManyDays first loops through files. In each file it 
 * the lowest temperature, and then compares it with the least value we got uptill now from all files we went through. If the current file has the lowest temp 
 * gives us the name of the current file else keeps old file as the lowest temp file. It utilises coldestHourInFile() to calculate the lowest temperature for any 
 * particular day and the coldestRowUpdation to update row which has the lowest temp subsequently also updates the file with lowest temperature.
 *
 * @author 
 * @version 18/10/2021
 */
import org.apache.commons.csv.*;
import java.io.*;
import edu.duke.*;
import java.lang.Double;
public class part3 {
    public CSVRecord coldestRowUpdation( CSVRecord coldestRow, CSVRecord currentRow, String measureItem)
    {
        if ( coldestRow == null)           //Checking if coldestRow is null, if so then we will assign currentRow to coldestRow.
        {
                coldestRow = currentRow;
        }
        else
        {
            double coldestTemp = Double.parseDouble(coldestRow.get(measureItem));   //Converting string to double using Double.parseDouble()
            double currentTemp = Double.parseDouble(currentRow.get(measureItem));
            if ( coldestTemp > currentTemp && currentTemp != -9999) //Checking if coldestTemp is greater than currentTemp, if so coldestTemp will be update with currentTemp. Also using && operator ignoring bogus values(-9999).
            {
                coldestRow = currentRow; //return coldestRow;
            }
        }
        return coldestRow;
    }
    public void printEverythingInFile(FileResource fr)
    {
        CSVParser parser = fr.getCSVParser();
        for( CSVRecord record : parser)
        {
            System.out.println( record.get("DateUTC") + ": "+ record.get("TemperatureF")); 
        }
    }
        
    public CSVRecord coldestHourInFile(CSVParser parser) //CSVParser is the handle to get data from CSV file.
    {
        CSVRecord coldestRow = null;            //CSVRecord helps us accessindividual data values.
        for( CSVRecord currentRow : parser)
        {
            coldestRow = coldestRowUpdation(coldestRow, currentRow, "TemperatureF"); 
        }
        return coldestRow; //Returning the coldest temparture containing row(A CSVRecord object).
    }
    public String coldestInManyDays()
    {
        String coldestFileName = "";
        CSVRecord coldestRow = null;
        File coldestFile = null;
        FileResource coldestFilefr = null;
        DirectoryResource dr = new DirectoryResource();  //Creating a directory resource to access directory.
        for( File f : dr.selectedFiles())  //Looping through files in the directory.
        {
            FileResource fr= new FileResource(f);    //Creating a new file resource and assigning the portal to current file(opened through the directory).
            CSVRecord currentLowestTempRow = coldestHourInFile(fr.getCSVParser());   //Opening another portal in the earlier file portal to access CSV data and passing that portal to find the coldest temparature in the file.
            coldestRow = coldestRowUpdation(coldestRow, currentLowestTempRow, "TemperatureF");//currentLowestTempRow;
            if( coldestRow == currentLowestTempRow)
            {
                coldestFile = f;
                coldestFilefr = fr;
            }
        }
        System.out.println("The file with coldest day is: " + coldestFile.getName());
        System.out.println("The coldest temperature in the file is: " +  coldestHourInFile(coldestFilefr.getCSVParser()).get("TemperatureF"));
        printEverythingInFile(coldestFilefr);
        return coldestFile.getName();
    }   
    public void testColdestInManyDays()
    {   
        String coldestFile = coldestInManyDays();
        //FileResource fr = new FileResource(coldestFile);
        //CSVParser parser = fr.getCSVParser();
        //for ( CSVRecord currentRow : parser)
        //{
           // System.out.println(currentRow.get("TemperatureF"));
        //}
        
    }
    public CSVRecord lowestHumidityInFile(CSVParser parser)
    {
        CSVRecord lowestHumidity = null;
        for ( CSVRecord currentRow : parser)
        {
            if(!currentRow.get("Humidity").equals("N/A"))
            {
                lowestHumidity = coldestRowUpdation(lowestHumidity, currentRow, "Humidity");
            }
        }
        return lowestHumidity;
    }
    public void testLowestHumidityInFile()
    {
        FileResource fr =new FileResource();
        CSVParser parser = fr.getCSVParser();
        CSVRecord coldestHumidity = lowestHumidityInFile(parser);
        System.out.println("The lowest Humidity recorded for the day is: " + coldestHumidity.get("Humidity") + ". The time lowest humidity was recorded is " + coldestHumidity.get("DateUTC"));
    }
    public CSVRecord lowestHumidityInManyFiles()
    {
        CSVRecord lowestHumidityRowMulti = null;
        DirectoryResource dR = new DirectoryResource();
        for ( File F : dR.selectedFiles())
        {
            FileResource fr = new FileResource(F);
            CSVRecord currentLowestHumidity = lowestHumidityInFile(fr.getCSVParser());
            lowestHumidityRowMulti = coldestRowUpdation( lowestHumidityRowMulti, currentLowestHumidity, "Humidity");
        }
        return lowestHumidityRowMulti;
    }
    public void testlowestHumidityInManyFiles()
    {
        CSVRecord lowestHumidityInManyFiles = lowestHumidityInManyFiles();
        System.out.println("The lowest Humidity for multiple days is " + lowestHumidityInManyFiles.get("Humidity") + ". Time of occurence is " + lowestHumidityInManyFiles.get("DateUTC"));
    }
    public double averageTemperatureInFile( CSVParser parser)
    {
        double sum = 0;
        int count = 0;
        for( CSVRecord record : parser)
        {
            if( Double.parseDouble(record.get("TemperatureF")) != -9999)
            {
                sum = Double.parseDouble(record.get("TemperatureF")) + sum ;
                count++;
            }
        }
        return sum/count;
    }
    public void testAverageTemperatureInFile()
    {
        FileResource fr = new FileResource();
        System.out.println("The average temperature of the given file is: " + averageTemperatureInFile(fr.getCSVParser()));
    }
    public double averageTemperatureWithHighHumidityInFile( CSVParser parser, int value)
    {
        double sum = 0;
        int count = 0;
        for( CSVRecord record : parser)
        {
            if( Double.parseDouble(record.get("TemperatureF")) != -9999 && Double.parseDouble(record.get("Humidity")) >= value)
            {
                sum = Double.parseDouble(record.get("TemperatureF")) + sum ;
                count++;
            }
        }
        if(count == 0)
        {
            return -1;
        }
        else
        {
            return sum/count;
        }
    }
    public void testAverageTemperatureWithHighHumidityInFile()
    {
        FileResource fr = new FileResource();
        double averageTemperature = averageTemperatureWithHighHumidityInFile(fr.getCSVParser(), 80);
        if( averageTemperature == -1)
        { 
            System.out.println("No temperatures with that humidity");
        }
        else 
        {
            System.out.println("The average temperature with high humidity is " + averageTemperature);
        }
    }
}

