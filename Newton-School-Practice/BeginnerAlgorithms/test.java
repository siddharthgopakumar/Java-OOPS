package BeginnerAlgorithms;


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
        int sum2 = 0;
        int N = scan.nextInt();
        int[] arr = new int[N-1];
        for( int i=0; i<N-1; i++)
        {
            arr[i] = scan.nextInt();
        }          
        Arrays.sort(arr); 
        int sum =(N)*(arr[0] + arr[N-2]);
        //System.out.println(sum);
        for(int i= 0; i< N-1; i++)
            {
               sum2 += arr[i]; // System.out.println(arr[i]);
            }
           System.out.println((sum - 2*sum2)/2);
    }

}
