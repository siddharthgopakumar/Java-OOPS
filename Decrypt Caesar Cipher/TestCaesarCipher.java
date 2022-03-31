
/**
 * Write a description of TesterClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.*;
public class TestCaesarCipher {
    public int[] countLetters(String message)
    {
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] counts = new int[26];
        for(int k=0; k< message.length(); k++)
        {
            char ch= Character.toUpperCase(message.charAt(k));
            int dex = alph.indexOf(ch);
            if(dex != -1)
            {    
                counts[dex] += 1;  //System.out.println(counts[dex] + "= "+ ch );
            }
        }
        return counts;
        }
     public int maxIndex(int[] vals)
        {
        int maxDex = 0;
        for(int k=0;k< vals.length; k++)
        {
            if(vals[k] > vals[maxDex])
            {
                maxDex = k;
            }
        }
        return maxDex;
    }
    public String breakCaesarCipher(String input)
    {
        int[] counts = countLetters(input);
        int maxDex = maxIndex(counts);
        int key = maxDex - 4;
        if(maxDex < 4)
        {
            key = 25 - (4 - maxDex);
        }
        ObjectOrientedCaesarCipher OOCC = new ObjectOrientedCaesarCipher(key);
        return OOCC.decrypt(input);
    }
    public void simpleTests()
    {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter the encrypted message:");
        String message = scan.nextLine();
        System.out.println(breakCaesarCipher(message));
    }
}
