package BeginnerAlgorithms;


/**
 * Write a description of insertionsort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class insertionsort {
    public void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
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
