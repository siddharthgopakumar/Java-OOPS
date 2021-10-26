
/**
 * Write a description of part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
public class copy_part3 {
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
{String dna1="ATGCCCTAA";
    System.out.println("The Stop Codon is starting at " + findStopCodon(dna1, 0,"TAA"));
}
public String findGene(String dna)
{
    int startIndex=dna.indexOf("atg");
    int temp = 0;
    System.out.println("\t\t\t\t\t StartIndex is " +startIndex);
    while(true)
    {
        
    if(temp == -1)
    { 
        return "";
    }
    int TAA= findStopCodon(dna, temp, "taa");
    int TAG= findStopCodon(dna, temp, "tag");
    int TGA= findStopCodon(dna, temp, "tga");
    int nearestStop =Math.min(TAA, Math.min(TAG, TGA));
    if(nearestStop == dna.length())
    {
        return "";
    }
    System.out.println("\t\t\t\t\t StartIndex is " +startIndex +"TAA is" +TAA +"TGA is" + TGA +"TAG is" + TAG);
    if((nearestStop+3 - startIndex)% 3 ==0)
    {
    return dna.substring(startIndex, nearestStop+3);
}
else
{
    temp = nearestStop+3;
}
}
}
public void testFindGene()
{
    FileResource fr = new FileResource("brca1line.fa");
    String dna = fr.asString();
    //String dna ="CAAATGGAGGGATGGGTGATAAGGTAA";
    printAllGenes(dna);
}
public void printAllGenes(String dna)
{
    int startIndex = 0;
    int count=0;
    while(true)
    {
        System.out.println("dna I am getting: " +dna);
        System.out.println("StartIndex is: " + startIndex);
        System.out.println("dna.substring(startIndex) is : " +dna.substring(startIndex));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$findGene" + findGene(dna.substring(startIndex)));
        String gene = findGene(dna.substring(startIndex));
        
        if(gene != "")
        {
        count =count + 1;
        }
        if (gene == "")
        {
            System.out.println("************************************entered the break and enjoying: ");
            break;
        }
        System.out.println("Gene is " + gene);
        startIndex = dna.indexOf(gene, startIndex) + gene.length() ;
        
    }
    System.out.println("Number of genes " + count);
}
}
