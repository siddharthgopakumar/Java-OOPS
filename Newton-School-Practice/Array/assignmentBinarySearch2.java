package Array;


/**
 * Write a description of assignmentBinarySearch2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class assignmentBinarySearch2 {
    public void searchleast()
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        long[][] arr = new long[T][];
        int[] mids = new int[T];
        for(int k = 0; k< T; k++)
        {
           int N = scan.nextInt();
           arr[k] = new long[N];
           
           for( int i=0; i < N ; i++)
           {
                 arr[k][i] = scan.nextInt();
           }
           int left =0, right = N-1, mid = (left + right)/2;
           if(N == 2)
           {
               //System.out.println("Hi from if");
               mid = 1;
               
            }
            else{
           while(mid != left && mid != right)
           {
                mid = (left + right)/2;
                if( arr[k][0] < arr[k][mid] )
                {
                    left = mid + 1;
                    continue;
                }
                if(arr[k][0] > arr[k][mid])
                {
                    right = mid -1;
                    continue;
                }
           }}
           mids[k] = (arr[k][0] < arr[k][mid])? 0:mid;
           //System.out.println(mids[k]);
    }
        for( int i=0; i<T; i++)
        {
            System.out.println(arr[i][mids[i]]);
        }
    }
    

}
