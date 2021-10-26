package Array;


/**
 * Write a description of MaxValueArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class MaxValueArray {
    public int maxInArray(int arr[])
    {
        int max = arr[0];
        int maxIdx = 0;
        for( int i = 1; i < arr.length; i++)
        {
            if( max < arr[i])
            {
                max = arr[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }
    public void tester()
    {
        Scanner scan  =new Scanner(System.in);
        int arr[] = new int[5];
        for( int i = 0; i < arr.length ; i++)
        {
            System.out.println("Enter the element numbered " + (i+1));
            arr[i] = scan.nextInt();
        }
        int maxEleIndex = maxInArray(arr);
        System.out.println("The maximum value in the array is: " + arr[maxEleIndex] + ", the max element is postioned at " + (maxEleIndex + 1));
    }
}
