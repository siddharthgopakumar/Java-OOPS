package BeginnerAlgorithms;


/**
 * Write a description of Selectionsort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Selectionsort {
    public void sort(int arr[])
    {
        int n = arr.length;
 
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        
    }
    public void Insertionsought1()
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[][] arr = new int[T][];
        for(int k =0; k < T; k++)
        {
            int N= scan.nextInt();
            arr[k] = new int[N];
            for(int i=0; i< N; i++)
            {
                //System.out.println(k);
                  arr[k][i] = scan.nextInt();
            }
        }
        for(int k=0; k<T; k++)
        {
            sort(arr[k]);
        }
        for(int k =0; k < T; k++)
        {
            for(int i=0; i< arr[k].length; i++)
            {
                  System.out.print(arr[k][i]+ " ");
            }
            System.out.println();
        }
    }

}
