
import java.util.*;
public class palindrome {
    public void isPalindrom()
    {
              System.out.println((int)('A' -'a'));
    }
     public boolean isVowel(char ch)
    {
        String vowels = "AEIOU";
        ch = Character.toUpperCase(ch);
        int index = vowels.indexOf(ch);
        return (index == -1)? false: true;
    }
    public void countnoVowels()
    {
        int count =0;
        Scanner scan = new Scanner(System.in);
        String test2 = scan.next();
        //String test1= "Test String";
        for(int i =0; i< test2.length(); i++ )
        {
            if(isVowel(test2.charAt(i)))
            {
                count++;
            }
        }
        System.out.println(count);
    }

}
