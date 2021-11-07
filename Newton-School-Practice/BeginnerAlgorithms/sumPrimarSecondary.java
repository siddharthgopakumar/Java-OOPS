package BeginnerAlgorithms;


/**
 * Write a description of sumPrimarSecondary here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class sumPrimarSecondary {
    public void sumMatrix()
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        long priSum = 0L, secSum = 0L;
        int[][] arr = new int[T][T];
        
        for( int i =0; i < T; i ++)
        {
            for(int j = 0; j< T; j++)
            {
                //System.out.println(i +  " "+ j);
                arr[i][j] = scan.nextInt();
                if(i==j)
                {
                    priSum += arr[i][j];
                }
                if(i+j == T-1)
                {
                    secSum += arr[i][j];
                }
            }
        }
        
        System.out.println(priSum + " " + secSum);

    }
}