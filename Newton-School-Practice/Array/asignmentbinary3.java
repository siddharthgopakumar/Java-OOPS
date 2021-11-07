package Array;

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
        int[][] arr = new int[T][];
        int[] mids = new int[T];
        for( int i =0; i<T; i++)
        {
            int N = scan.nextInt();
            arr[i] = new int[N];
            for( int j=0; j< N; j++)
                arr[i][j] = scan.nextInt();
            int l=0, r=arr[i].length-1;
            int count =0;
            while(l < r)
            {
                if(arr[i][0] < arr[i][arr[i].length - 1])
                {
                    mids[i] = 0;
                    break;
                }
                int m=(l+r)/2;
                if(m != 0 && arr[i][m] < arr[i][m-1])
                {
                    mids[i] = m;
                    break;
                }
                if(m != N-1 && arr[i][m] > arr[i][m+1])
                {
                    mids[i] = m+1;
                    break;
                }
                if(arr[i][m] > arr[i][r])
                {
                    l = m+1;
                    continue;
                }
                if(arr[i][m] < arr[i][l])
                {
                    r = m-1;
                    continue;
                }

                    }   
            }
            for( int i =0; i<T; i++)
                System.out.println(arr[i][mids[i]]);  
        }
    }

