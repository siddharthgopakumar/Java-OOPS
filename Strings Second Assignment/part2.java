
/**
 * Write a description of part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class part2 {
public int howMany( String stringa, String stringb)
{
    int startP = 0,count = 0, len=0;
    while( startP != -1 && startP <= stringb.length())
    {   startP = stringb.indexOf(stringa, startP + len);
        count= count +1;
        len= stringa.length();      
    }
    return count-1;
}
public void howMany()
{
    String stringb = "ATGAACGAATTGAATC", stringa = "GAA";
    System.out.println("The number of times stringa was found in stringb is " + howMany(stringa, stringb));
}
}
