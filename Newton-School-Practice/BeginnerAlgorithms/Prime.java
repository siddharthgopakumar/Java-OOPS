
/**
 * Write a description of Prime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Prime {
public void Primeumber ()
{
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int i = 0;
    for( i = 2 ; i < n ; i++) //looping
    {
        if( n % i == 0 )
        {System.out.println("in loop " + i);
            break;
        }
        
    }   
    System.out.println( i == n ? "Prime" : "Non Prime" );
}
}
