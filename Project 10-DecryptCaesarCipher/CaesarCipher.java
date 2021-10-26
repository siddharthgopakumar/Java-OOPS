/**
 * Write a description of CaesarCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.*;
public class CaesarCipher {
    public String encrypt(String input, int key1,  int key2)
    {
        StringBuilder encrypted = new StringBuilder(input);
        String alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetLower = alphabetUpper.toLowerCase();
        String codeUpperKey1 = alphabetUpper.substring(key1) + alphabetUpper.substring(0, key1);
        String codeLowerKey1 = alphabetLower.substring(key1) + alphabetLower.substring(0, key1);
        String codeUpperKey2 = alphabetUpper.substring(key2) + alphabetUpper.substring(0, key2);
        String codeLowerKey2 = alphabetLower.substring(key2) + alphabetLower.substring(0, key2);
        for(int i =0; i < encrypted.length(); i++)
        {
            char currentChar = encrypted.charAt(i);
            if( i % 2 == 0)
            {
                if(Character.isUpperCase(currentChar))
                {
                    int idx = alphabetUpper.indexOf(currentChar);
                    if(idx != -1)
                    {
                        char newChar = codeUpperKey1.charAt(idx);
                        encrypted.setCharAt(i, newChar);
                    }
                }
                else
                {
                    int idx = alphabetLower.indexOf(currentChar);
                    if(idx != -1)
                    {
                        char newChar = codeLowerKey1.charAt(idx);
                        encrypted.setCharAt(i, newChar);
                    }
                }
            }
            else
            {
                if(Character.isUpperCase(currentChar))
                {
                    int idx = alphabetUpper.indexOf(currentChar);
                    if(idx != -1)
                    {
                        char newChar = codeUpperKey2.charAt(idx);
                        encrypted.setCharAt(i, newChar);
                    }
                }
                else
                {
                    int idx = alphabetLower.indexOf(currentChar);
                    if(idx != -1)
                    {
                        char newChar = codeLowerKey2.charAt(idx);
                        encrypted.setCharAt(i, newChar);
                    }
                }
            }
        }
        return encrypted.toString();
    }
    public void testEncrypt()
    {
        FileResource fr = new FileResource();
        Scanner scan = new Scanner(System.in);
        System.out.println("Select the file containing the message:");
        //String unencryptedMessage = scan.nextLine();
        String unencryptedMessage = fr.asString();
        System.out.println("Enter the key 1:");
        int key1 = scan.nextInt();
        System.out.println("Enter the key 2:");
        int key2 = scan.nextInt();
        System.out.println("The Encrypted message is\n" + encrypt(unencryptedMessage, key1, key2));
    }
}
