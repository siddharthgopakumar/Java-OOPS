 

/**
 * Write a description of asignmentbinary3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class asignmentbinary3 {
    public void assignment()
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int l=0;
        long[][] arr = new long[T][];
        int[] mids = new int[T];
        for(int k = 0; k< T; k++)
        {
            int N = scan.nextInt();
            arr[k] = new long[N];

            for( int i=0; i < N ; i++)
            {
                arr[k][i] = scan.nextLong();
            }
        }
        for( int i=0; i< T; i++)
        {
            int left =0, right = N-1, mid = (left + right)/2;
            if(N == 2)
            {
                //System.out.println("Hi from if");
                mid = 1;

            }
            else{
                while(l < 2)
                {
                    mid = (left + right)/2;
                    if( arr[i][0] < arr[i][mid] )
                    {
                        right = mid - 1;

                    }
                    if(arr[k][0] < arr[k][mid])
                    {
                        left = mid + 1;

                    }
                    if(mid == left && mid == right)
                        break;

                }}
            System.out.println("******************************");
            mids[k] = (arr[k][0] < arr[k][mid])? 0:mid;}
        for( int i=0; i<T; i++)
        {
            System.out.println(arr[i][mids[i]]);
        }
        //System.out.println(mids[i]);
    }

}

