package BeginnerAlgorithms;


/**
 * Write a description of bubbleSortMe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class bubbleSortMe {
    public void bubbleSorti()
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for( int i =0; i< N; i++)
        {
            arr[i] = scan.nextInt();
        }
        for( int i = 0; i < N-1; i++)
        {
            for(int j =0; j < N-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        for( int i =0; i< N; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

}
