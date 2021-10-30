
/**
 * Write a description of WordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class WordPlay {
    public boolean isVowel(char ch)
    {
        String vowels = "AEIOU";
        ch = Character.toUpperCase(ch);
        int index = vowels.indexOf(ch);
        return (index == -1)? false: true;
    }
    public String replaceVowels( String phrase, char ch)
    {
        StringBuilder replaced = new StringBuilder(phrase);
        for ( int i = 0; i < replaced.length(); i++)
        {
            char currChar = replaced.charAt(i);
            if(isVowel(currChar))
            {
                replaced.setCharAt(i, ch);
            }
        }
        return replaced.toString();
    }
    public String emphasize(String phrase, char ch)
    {
        StringBuilder replaced = new StringBuilder(phrase);
        for(int i=0; i<replaced.length(); i++)
        {
            char currChar = Character.toUpperCase(replaced.charAt(i));
            if(currChar == Character.toUpperCase(ch))
            {
                if(i%2 == 0)
                {
                    replaced.setCharAt(i, '*');
                }
                else
                {
                    replaced.setCharAt(i,'+');
                }
            }
        }
        return replaced.toString();
    }
    public void testReplaceVowels()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the test line:");
        String testString = scan.nextLine();
        System.out.println("Enter symbol to be put in place of vowels");
        char ch = scan.next().charAt(0);
        System.out.println("test string replacing vowels is " + replaceVowels(testString, ch) +".");
    }
      public void testEmphasize()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the test line:");
        String testString = scan.nextLine();
        System.out.println("Enter the character you want to change in the string:");
        char ch = scan.next().charAt(0);
        System.out.println("test string replacing vowels is " + emphasize(testString, ch) +".");
    }
}
