package BeginnerAlgorithms;


/**
 * Write a description of sumof2Dmatrix here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class sumof2Dmatrix {
    public void sumMatrix()
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt(), N = scan.nextInt();
        long maxSum = 0L, currSum = 0L;
        int[][] arr = new int[T][N];
        for( int i =0; i < T; i ++)
        {
            for(int j = 0; j< N; j++)
            {
                //System.out.println(i +  " "+ j);
                arr[i][j] = scan.nextInt();
            }
        }
        for( int i =0; i < N; i ++)
        {
            for(int j = 0; j< T; j++)
            {
                currSum += arr[j][i];
            }
            if( currSum > maxSum )
            {
                maxSum =currSum;
            }
            currSum = 0;
        }
        System.out.println(maxSum);
    }
    

}
