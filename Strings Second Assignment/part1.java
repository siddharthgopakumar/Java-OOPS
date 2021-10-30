
/**
 * Write a description of part1 here.
 * 
 * @author Siddharth
 * @version (a version number or a date)
 */
import edu.duke.FileResource;
public class part1 {
public int findStopCodon(String dna, int startIndex, String stopCodon)
{
    int stopIndex=dna.indexOf(stopCodon,startIndex+3);
    if(stopIndex==-1)
    {
        return dna.length();
    }
    return stopIndex;
}
public void testFindStopCodon()
{String dna1="ATGCCCATGTAA";
    System.out.println("The Stop Codon is starting at " + findStopCodon(dna1, 0,"TAA"));
}
public String findGene(String dna)
{
    int startIndex = dna.indexOf("atg");
    int nearestStop = 0;
    if( startIndex == -1)
    {
        return "";
    }
    int temp = startIndex;
    System.out.println("77777777777777777777Temp is :  " + temp +"startIndex is:" +startIndex);
    
   
    int TAA= findStopCodon(dna, temp, "taa");
    int TAG= findStopCodon(dna, temp, "tag");
    int TGA= findStopCodon(dna, temp, "tga");
    
    nearestStop = Math.min(TAA, Math.min(TAG, TGA));
    if(nearestStop == dna.length())
    {
        break;
    }
    if( (nearestStop -1) %3 == 0)
     {
         System.out.println("nearestStop\t" + (nearestStop+startIndex) +"startIndex\t" +startIndex);
         System.out.println("Temp is :  " + temp +"startIndex is:" +startIndex);
         
      }
temp = nearestStop;
System.out.println("**************Temp is :  " + temp +"*********nearestStop is:" +nearestStop);
}  
return dna.substring(startIndex, nearestStop + 3);
}

public void testFindGene()
{
    /*String dna1= "CCCGGGTAA";
    String dna2= "ATGGACCCCTAA";
    String dna3= "ATGTAATAGTGA";
    String dna4= "ATGTACGTACGAT";*/
    //String dna5= "AACCGGTTATCATGGGCCTGGTATGGGGTGATCATGTGGCTTTACTGACCCAAAAATGCCCAAATTTTAGA";
    /*System.out.println("The DNA is " + dna1);
    System.out.println("The Gene found is: " + findGene(dna1));
    System.out.println("The DNA is " + dna2);
    System.out.println("The Gene found is: " + findGene(dna2));
    System.out.println("The DNA is " + dna3);
    System.out.println("The Gene found is: " + findGene(dna3));
    System.out.println("The DNA is " + dna4);
    System.out.println("The Gene found is: " + findGene(dna4));
    System.out.println("The DNA is " + dna5);
    System.out.println("The Gene found is: " + findGene(dna5)); */
    FileResource fr = new FileResource("brca1line.fa");
    String dna = fr.asString();
    printAllGenes(dna);
}
public void printAllGenes(String dna)
{
    int startIndex = 0;
    int count=0;
    while(true){
        String gene = findGene(dna.substring(startIndex));
        if (gene == "")
        {
           break;
        }
        System.out.println(gene);
        
 startIndex = gene.length() + startIndex;
    

   // System.out.println("Total number of genes is:\t" + count);

}
}
}

