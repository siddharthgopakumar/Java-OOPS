package contest;


/**
 * Write a description of test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class test {
    public void tester()
    {
      Scanner scan = new Scanner(System.in);
      int T =scan.nextInt();
	int[] arr = new int[T+1];
	int prime = 2; boolean isPrime =true;
	for(int i =1; i <= T; i++)
	{
             for(int j =2; i<prime; j++)
	     {
		   if(prime%j == 0)
		   {
                       isPrime =false;
		   }
	      }
	       if(isPrime)
	      {
		   arr[i] = prime;
	       }
	  } 
	int L = scan.nextInt(), R =scan.nextInt(), sum =0;
	for(int i = L; i<=R; i++)
	{
          sum = arr[i]+sum;
	}       
	   System.out.println(sum);          // Your code here
	}
	}
    

