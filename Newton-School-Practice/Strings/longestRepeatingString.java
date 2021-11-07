package Strings;

/**
 * Write a description of test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class longestRepeatingString {
    public void test1()
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), idxI = 0, shortestWord = 1,lastRepeat = 0, repeat = 0, longstringidx =0; 
        scan.nextLine();
        String currString = "";
        StringBuilder testString = new StringBuilder(scan.nextLine());
        testString.append(' ');
        int minLen = testString.substring(0, testString.indexOf(" ")).length();
        boolean toggle = true;
        for( int i = 1; i <= minLen; i++)
        {
            for( int j =1; j <= N; j++)
            {
                currString = testString.substring(idxI,idxI+i);
                //else
                //  {
                //     currString = testString.substring(idxI, testString.indexOf(" ", idxI));
                // }
                //System.out.println("Current String " + currString);
                //System.out.println("Search String" + " " + testString.substring(0, 0 + i));
                //System.out.println(testString.substring(0, 0 + i).equals(currString));
                if(!testString.substring(0, 0 + i).equals(currString))
                {
                    break;
                }
                else
                {
                    repeat++;
                }
                if( i == 1)
                    minLen = (testString.substring(idxI, testString.indexOf(" ", idxI)).length() < minLen)?testString.substring(idxI, testString.indexOf(" ", idxI)).length() : minLen;

                idxI =  testString.indexOf(" ",idxI) + 1;

            }
            //System.out.println("Minimum length: " + minLen); 
            //System.out.println("repeat ");
            if(repeat == N)
            {
                longstringidx = i;
                lastRepeat = repeat;
            }
            idxI = 0;

            repeat = 0;
        }

        //System.out.println("minlength " + minLen);
        //System.out.println(repeat);
        System.out.println((lastRepeat == N)? testString.substring(0,longstringidx):-1);
    }
}

