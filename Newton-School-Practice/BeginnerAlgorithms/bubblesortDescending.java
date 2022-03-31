package BeginnerAlgorithms;


/**
 * Write a description of bubblesort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class bubblesortDescending {
    public void nbublesort()
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[] arr = new int[T];
        for(int k =0; k < T; k++)
        {
                  arr[k] = scan.nextInt();
        }
        for(int i=0; i< arr.length -1; i++)
            {
                  for(int j = 0; j < arr.length-i-1; j++)
                  {
                        //System.out.println(arr[k][j] + "  " + arr[k][j+1]);
                      if(arr[j] < arr[j+1])
                        {
                            
                             int temp = arr[j];
                             arr[j] = arr[j+1];
                              arr[j+1] = temp;
                         }
                  }
            }
        
        for(int k =0; k < T; k++)
        {
             System.out.print(arr[k]+ " ");
        }
    }
}
