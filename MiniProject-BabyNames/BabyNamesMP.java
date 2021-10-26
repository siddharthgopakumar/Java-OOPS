
/**
 * Write a description of BabyNamesMP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import org.apache.commons.csv.*;
import edu.duke.*;
import java.io.*;
public class BabyNamesMP {
    public void totalBirths( FileResource fr)
    {
        int totalBirths = 0, totalBoys = 0, totalGirls = 0, numberNames = 0, numberBoyNs = 0, numberGirlNs = 0;
        for ( CSVRecord rec : fr.getCSVParser(false))
        {
            totalBirths += Integer.parseInt(rec.get(2));
            numberNames++;
            if(rec.get(1).equals("F"))
            {
                totalGirls += Integer.parseInt(rec.get(2));
                numberGirlNs++;
            }
            else 
            {
                totalBoys += Integer.parseInt(rec.get(2));
                numberBoyNs++;
            }
        }
        System.out.println("Total Births= " + totalBirths + ". Total number of names= " + numberNames + "." + "\nTotalGirls= " + totalGirls + ". Number of girl names= "+ numberGirlNs +".");
        System.out.println("TotalBoys= " + totalBoys + ". Number of boy names= " + numberBoyNs + ".");
        
    } 
    public int getRank( int year, String name, String gender, FileResource fr)
    {
        int rank = 0;
        //FileResource fr = new FileResource();
        for ( CSVRecord rec : fr.getCSVParser(false))
        {
            if ( rec.get(1).equals(gender))
            {
                rank ++;
                if(rec.get(0).equals(name))
                {
                    return rank;
                }
            }
        }
        return -1;
    }
    public String getName( int year, int rank, String gender)
    {
        int rankInNewYear = 0;
        FileResource fr = new FileResource();
        for ( CSVRecord rec : fr.getCSVParser(false))
        {
            if ( rec.get(1).equals(gender))
            {
                rankInNewYear ++;
                if( rankInNewYear == rank)
                {
                    return rec.get(0);
                }
            }
        }
        return "NO NAME";
    }
    public String whatIsNameInYear( String name, int year, int newYear, String gender)
    {
        FileResource fr= new FileResource();
        return getName(newYear, getRank(year, name, gender, fr)  , gender);
    }
    public int yearOfHighestRank( String name, String gender)
    {
        int year = 0, highestRank =0;
        DirectoryResource dr = new DirectoryResource();
        for( File f : dr.selectedFiles())
        {
            FileResource fr = new FileResource(f);
            if(getRank(2012,name, gender,fr)!= -1 && highestRank == 0)
            {
             highestRank = getRank(2012,name, gender,fr);   
             year = Integer.parseInt(f.getName().substring(f.getName().indexOf("b")+1, f.getName().indexOf(".")));
            }
            else if(highestRank > getRank(2012,name, gender,fr) && getRank(2012,name, gender,fr)!= -1)
            {
                highestRank = getRank(2012,name, gender,fr);
                year = Integer.parseInt(f.getName().substring(f.getName().indexOf("b")+1, f.getName().indexOf(".")));
            }
        }
        return (year == 0)? -1: year;
    }
    public double getAverageRank(String name, String gender)
    {
        int numberYears = 0, sumRank = 0;
        DirectoryResource dr = new DirectoryResource();
         for( File f : dr.selectedFiles())
        {
            FileResource fr = new FileResource(f);
            if(getRank(2012,name,gender, fr) != -1)
            {
                sumRank = sumRank + getRank(2012,name,gender, fr);
                numberYears++;
            }
        }
        return (sumRank == 0)?-1: (double)sumRank/numberYears;
    }
    public int getTotalBirthsRankedHigher( int year, String name, String gender)
    {
        int totalBirthsHigher = 0;
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser(false);
        for( CSVRecord rec : fr.getCSVParser(false))
        {
            if(gender.equals(rec.get(1)))
            {
                if(rec.get(0).equals(name))
                {
                    return totalBirthsHigher;
                }
                totalBirthsHigher = totalBirthsHigher + Integer.parseInt(rec.get(2));
            }
        }
        return  -1;
    }
    public void testTotalBirths()
    {
        String filepath = "G:/My Drive/Temp/MOOCs/Coursera/Java Programming- Solving Problems with Java/MiniProject-BabyNames/us_babynames_by_year/yob1905.csv";//f.getAbsolutePath();
        FileResource fr = new FileResource(filepath);
        totalBirths(fr);
    }
    public void testGetRank()
    {
        FileResource fr = new FileResource();
        System.out.println("The rank for name Frank, year of birth 1971 and gender M is " + getRank( 1971, "Frank", "M", fr )); //here we are running a test value in file yob2012short.csv
    }
    public void testGetName()
    {
        System.out.println("The name at the rank is " + getName(2012, 450, "M"));
    }
    public void testWhatIsNameInYear()
    {
        String name = "Owen";
        int year = 1974;
        int newYear = 2014;
        String gender = "M";
        System.out.println(name + " born in " + year + " would be " + whatIsNameInYear( name, year, newYear, gender) +" if she was born in " + newYear +".");
    }
    public void testYearOfHighestRank()
    {   
        String name = "Mich", gender = "M";
        System.out.println(yearOfHighestRank( name,gender ));
    }
    public void testGetAverageRank()
    {
        String name = "Robert", gender = "M";
        System.out.println(getAverageRank(name, gender));
    }
    public void testGetTotalBirthsRankedHigher()
    {
        System.out.println("Total births ranked higher is " + getTotalBirthsRankedHigher( 2012, "Drew","M"));
    }
}
