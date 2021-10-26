
/**
 * Write a description of FibonacciSeries here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class FibonacciSeries {
    public void printFibonacciSeries()
    {
       int prev = 0, curr = 1, i;
       Scanner scan = new Scanner( System.in );
       int n = scan.nextInt();
       System.out.print(0 + ", " + 1);
       for( i = 0; i< n-2; i++)
       {
           curr = curr + prev;
           prev = curr - prev;
           System.out.print(", " + curr);
       }
       System.out.print("\n" + i);
    }
}
