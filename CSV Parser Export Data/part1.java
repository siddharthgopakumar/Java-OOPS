
/**
 * Write a description of part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import org.apache.commons.csv.*;
public class part1 {
    public void tester()
    {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        System.out.println("Country details:\n" + countryinfo( parser, "Nauru"));
        parser = fr.getCSVParser(); //parser needs to be reset before every function call
        listExportersTwoProducts( parser, "gold", "diamonds"); //if the two export items are present then prints the country name.
        parser = fr.getCSVParser(); //parser needs to be reset before every function call
        System.out.println("Number of exporters of cocoa is: " + numberOfExporters( parser, "cocoa")); //numberOfExporters() returns the number of countries exporting a given.
        parser = fr.getCSVParser(); //parser needs to be reset before every function call
        bigExporters( parser, "$999,999,999,999");
    }
    public String countryinfo(CSVParser parser, String country)
    {
        String countryinfo = "NOT FOUND";
        for ( CSVRecord record : parser)
        {
        if(country.equals(record.get("Country"))) //.equals() checks if two strings are same if same it returns true it's a fuunction in string class.
        { 
             countryinfo = record.get("Country") + " : " + record.get("Exports") + " : " + record.get("Value (dollars)");
        }
        }
        return countryinfo;
    }
    public void listExportersTwoProducts( CSVParser parser, String exportitem1, String exportitem2)
    {
        for( CSVRecord record : parser)
        {
            if(record.get("Exports").contains(exportitem1) && record.get("Exports").contains(exportitem2)) //contains is method in StorageResource class. This conditional checks if both items are in exports column.
            {
                System.out.println("Countries Exporting given two products are \n" + record.get("Country") +"\n");
            }
        }
    }
    public int numberOfExporters( CSVParser parser, String exportItem)
    {
        int count = 0;
        for ( CSVRecord record : parser)
        {
            if(record.get("Exports").contains(exportItem))
            {
                count += 1;
            }
        }
        return count;
    }
    public void bigExporters( CSVParser parser, String amount)
    {
        for ( CSVRecord record : parser)
        {
            if(record.get("Value (dollars)").length() > amount.length())
            {
                System.out.println(record.get("Country") + " " + record.get("Value (dollars)"));
            }
        }
    }
}
