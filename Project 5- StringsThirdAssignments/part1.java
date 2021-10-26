
/**
 * Write a description of part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

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
{String dna1="ATGCCCTAA";
    System.out.println("The Stop Codon is starting at " + findStopCodon(dna1, 0,"TAA"));
}
public String findGene(String dna)
{
    int startIndex=dna.indexOf("ATG");
    if(startIndex==-1)
    { 
        return "";
    }
    int TAA= findStopCodon(dna, startIndex, "TAA");
    int TAG= findStopCodon(dna, startIndex, "TAG");
    int TGA= findStopCodon(dna, startIndex, "TGA");
    int nearestStop =Math.min(TAA, Math.min(TAG, TGA));
    if(nearestStop == dna.length())
    {
        return "";
    }
    return dna.substring(startIndex, nearestStop+3);
}
public void testFindGene()
{
    String dna1= "CCCGGGTAA";
    String dna2= "ATGGACCCCTAA";
    String dna3= "ATGTAATAGTGA";
    String dna4= "ATGTACGTACGAT";
    String dna5= "AACCGGTTATCATGGGCCTGGTAGGGTGATCATGTGGCTTTACTGACCCAAAAATGCCCAAATTTTAGA";
    System.out.println("The DNA is " + dna1);
    System.out.println("The Gene found is: " + findGene(dna1));
    System.out.println("The DNA is " + dna2);
    System.out.println("The Gene found is: " + findGene(dna2));
    System.out.println("The DNA is " + dna3);
    System.out.println("The Gene found is: " + findGene(dna3));
    System.out.println("The DNA is " + dna4);
    System.out.println("The Gene found is: " + findGene(dna4));
    System.out.println("The DNA is " + dna5);
    System.out.println("The Gene found is: " + findGene(dna5));
    printAllGenes(dna5);
}
public void printAllGenes(String dna)
{
    int startIndex = 0;
    int count=0;
    while(true)
    {
        String gene = findGene(dna.substring(startIndex));
        if(findGene(dna.substring(startIndex)) != "")
        {
        count =count + 1;
        }
        if (gene == "")
        {
            break;
        }
        System.out.println("Gene is " + gene);
        startIndex = dna.indexOf(gene, startIndex) + gene.length() ;
        
    }
    System.out.println("Number of genes " + count);
}
public void 
}

        
        

