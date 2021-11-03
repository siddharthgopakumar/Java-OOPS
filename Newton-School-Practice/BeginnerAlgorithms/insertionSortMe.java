package BeginnerAlgorithms;


/**
 * Write a description of insertionSortMe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class insertionSortMe {
    public void insertionSort()
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for( int i=0; i<N; i++)
        {
            arr[i] = scan.nextInt();
        }
        for( int k =1; k< N; k++)
        {
            int key = arr[k];
            int j = k-1;
            while(j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for( int i=0; i<N; i++)
        {
            System.out.println(arr[i]);
        }
    }

}
