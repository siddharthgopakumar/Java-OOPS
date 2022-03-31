
/**
 * Write a description of Part1 here.
 * 
 * @author (Siddharth) 
 * @version (a version number or a date)
 */
public class Part1 {
public String findSimpleGene(String dna)
{
    int Start=dna.indexOf("ATG");
    if(Start==-1)
    {return "";}
    int End=dna.indexOf("TAA",Start+3);
    int p=Start+3;
    System.out.println("Start+3 and StartCodon is " +p  + dna.substring(Start,Start+3));
    if(End ==-1)
    {return "";}
    if(dna.substring(Start,End+3).length()%3!=0)
    {return "";}
    return dna.substring(Start,End+3);
}
public void testSimpleGene()
{
    String string1="AGCTTAA"; 
    String string2="ATGTAG";
    String string3="GGGCCCAAA";
    String string4="ATGGGGCCCTAA";
    String string5="AAATGCCCTAACTAGATTAAGAAACC";//"ATGGGCCTAA";
    System.out.println("DNA is "+string1);
    System.out.println("Gene is "+findSimpleGene(string1));
    System.out.println("DNA is "+string2);
    System.out.println("Gene is "+findSimpleGene(string2));
    System.out.println("DNA is "+string3);
    System.out.println("Gene is "+findSimpleGene(string3));
    System.out.println("DNA is "+string4);
    System.out.println("Gene is "+findSimpleGene(string4));
    System.out.println("DNA is "+string5);
    System.out.println("Gene is "+findSimpleGene(string5));
}
}


