package BeginnerAlgorithms;


/**
 * Write a description of test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class FindanAptTitle {
    public void tester()
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[][] arr = new int[T][3];
        for(int k=0; k< T; k++)
        {
            int N = scan.nextInt();
            for( int i=0; i< N; i++)
            {
                int Temp = scan.nextInt();
                if(Temp >= arr[k][0])
                {
                    arr[k][2] = arr[k][1];
                    arr[k][1] = arr[k][0];
                    arr[k][0] = Temp;
                }
                else if(Temp >= arr[k][1])
                {
                    arr[k][2] = arr[k][1];
                    arr[k][1] = Temp;
                }
                else if(Temp >= arr[k][2])
                {
                    arr[k][2] = Temp;
                }
            }
        }
        for(int k=0; k<T; k++)
        {
            for(int i = 0; i<3; i++)
            {
                System.out.print(arr[k][i] + " ");
            }
            System.out.println();
        }
    }

}
