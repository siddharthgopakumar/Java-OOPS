
/**
 * Write a description of DecryptCaesarCipher here.
 * 
 * @author Siddharth 
 * @version 26/10/2021
 */
import edu.duke.*;
import java.util.*;
public class CaesarBreaker {
    public String decrypt(String encrypted)
    {
        CaesarCipher cc= new CaesarCipher();
        int[] countLetters = countLetters(encrypted);
        int maxIndex = maxIndex(countLetters);
        int decryptionKey = maxIndex - 4;
        if(maxIndex < 4)
        {
            decryptionKey = 26 - ( 4 - maxIndex );
        }
        return cc.encrypt(encrypted, 26 - decryptionKey, 26 - decryptionKey);
    }
    public int[] countLetters(String encrypted)
    { 
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int[] counter = new int[26];
        for(int i = 0; i< encrypted.length(); i++)
        {
            char ch = Character.toLowerCase(encrypted.charAt(i));
            if(alpha.indexOf(ch)!= -1)
            {
                counter[alpha.indexOf(ch)]++;
            }
        }
        return counter;
    }
    public int maxIndex(int[] countLetters)
    {
        int maxIndex = 0;
        for(int i= 0; i<countLetters.length; i++)
        {
            if(countLetters[i] > countLetters[maxIndex])
            {
                maxIndex =i;
            }
        }
        return maxIndex;
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
    public int getKey(String s)
    {
        int[] frequency = countLetters(s);
        int maxIndex = maxIndex(frequency);
        int key = maxIndex - 4;
        if(maxIndex < 4)
        {
            key = 26-(4-maxIndex);
        }
        return (26-key);
    }
    public String decryptTwoKeys(String encryptedMessage)
    {
        CaesarCipher cc= new CaesarCipher();
        String[] encrypted = new String[2];
        int[] key = new int[2];
        for(int i= 0; i<encrypted.length; i++)
        {
            encrypted[i] = halfOfString(encryptedMessage, i);
            key[i] = getKey(encrypted[i]);
        }
        System.out.println("Key 1 is " + key[0] + ", Key 2 is " + key[1]);
        return cc.encrypt(encryptedMessage,key[0],key[1]);
    }
    public void tester()
    {
        FileResource fr = new FileResource();
        String encryptedMessage = fr.asString();
        System.out.println(decryptTwoKeys(encryptedMessage));  
    }

}
