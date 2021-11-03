
/**
 * Write a description of TestCaesarCipherII here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
public class TestCaesarCipherII {
    public int[] countLetters(String message)
    {
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] counts = new int[26];
        for(int k=0; k< message.length(); k++)
        {
            char ch= Character.toUpperCase(message.charAt(k));
            int dex = alph.indexOf(ch);
            if(dex != -1)
            {counts[dex] += 1;
            //System.out.println(counts[dex] + "= "+ ch );
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
    public String halfOfString(String message, int start)
    {
        StringBuilder messageSB = new StringBuilder();
        for(int i=start; i< message.length(); i+=2)
        {
            messageSB.append(message.charAt(i));
        }
        return messageSB.toString();
    }
    public void simpleTests()
    {
        FileResource fr = new FileResource();
        String input = fr.asString();
        //ObjectOrientedCaesarCipherII oCII =  new ObjectOrientedCaesarCipherII(14,24);
        //System.out.println(oCII.encrypt(input));
        //System.out.println(oCII.decrypt("Hfs cpwewloj loks cd Hoto kyg Cyy"));
        System.out.println(breakCaesarCipher(input));
        //System.out.println(breakCaesarCipher("Aal uttx hm aal Qtct Fhljha pl Wbdl. Pvxvxlx!"));
    }
    public String breakCaesarCipher(String input)
    {
        String input0 = halfOfString(input, 0), input1 = halfOfString(input, 1);
        int[] freqs = countLetters(input0);
        int maxDex = maxIndex(freqs);
        int key1 =  maxDex - 4;
        if(maxDex < 4)
        {
              key1 = 26-(4-maxDex);
        }
        freqs = countLetters(input1);
        maxDex = maxIndex(freqs);
        int key2 =  maxDex - 4;
        if(maxDex < 4)
        {
            key2 = 26-(4-maxDex);
        }
        System.out.println("The two keys used for encryption are" + key1 + ", " + key2);
        ObjectOrientedCaesarCipherII oCII = new ObjectOrientedCaesarCipherII(key1, key2);
        return oCII.decrypt(input);
    }
}
