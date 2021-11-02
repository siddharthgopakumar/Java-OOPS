package BeginnerAlgorithms;


/**
 * Write a description of testbuffer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class PalindromNumbers
 {
    public void tester()
    {
        int N = 9999;
        int condition = (int)Math.ceil(Math.log10(N))/2;
        System.out.println(condition);
        for(int i = 0; i < condition; i++)
        {

           if( N/(int)Math.pow(10,(int)Math.log10(N)) != N%10)
                {
                    
                    System.out.println((int)(N/Math.pow(10, (int)Math.log10(N))) + " : " + N%10);
                    System.out.println(false);
                    
                }
                N = (int)(N%Math.pow(10, ((int)Math.log10(N))));
                
                N = N/10;
                System.out.print(N + "\n");
        }  
        System.out.println(true);
       
    }
    
    }

