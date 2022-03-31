package BeginnerAlgorithms;


/**
 * Write a description of bubblesort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class bubblesort {
    public void nbublesort()
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
        
        for(int k =0; k < T; k++)
        {
        
            for(int i=0; i< arr[k].length -1; i++)
            {
                  for(int j = 0; j < arr[k].length-i-1; j++)
                  {
                        //System.out.println(arr[k][j] + "  " + arr[k][j+1]);
                      if(arr[k][j] > arr[k][j+1])
                        {
                            
                             int temp = arr[k][j];
                             arr[k][j] = arr[k][j+1];
                              arr[k][j+1] = temp;
                         }
                  }
            }
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
