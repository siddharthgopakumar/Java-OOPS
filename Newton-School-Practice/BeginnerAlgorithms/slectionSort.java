package BeginnerAlgorithms;


/**
 * Write a description of slectionSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class slectionSort {
    public void selectionSort()
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++)
        {
            arr[i] = scan.nextInt();
        }
        for( int i =0; i<N-1; i++)
        {
            int min_Index = i;
            for( int j = i+1; j < N; j++)
            {
                if(arr[j] < arr[min_Index])
                {
                    min_Index = j;
                }
            }
            int temp = arr[min_Index];
            arr[min_Index] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0; i < N; i++)
        {
            System.out.print(arr[i] + " ");  
        }
    }

}
