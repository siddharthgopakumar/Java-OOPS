package Array;


/**
 * Write a description of linearSearch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class linearSearch {
    public int linearSearch(int arr[], int searchValue)
    {
        int max = arr[0];
        int maxIdx = 0;
        for( int i = 1; i < arr.length; i++)
        {
            if( searchValue == arr[i])
            {
                return i;
                
            }
        }
        return -1;
    }
    public int[] arrayMaker(int arr[])
    {
        for( int i = 0; i < arr.length ; i++)
        {
            Scanner scan  = new Scanner(System.in);
            System.out.println("Enter the element numbered " + (i+1));
            arr[i] = scan.nextInt();
        }
        return arr;
    }
    public void tester()
    {
        Scanner scan  = new Scanner(System.in);
        int arr[] = new int[5];
        arr = arrayMaker(arr);
        System.out.println("Enter the value that you want to find in the array.");
        int searchValue = scan.nextInt();
        int searchIndex = linearSearch( arr, searchValue);
        System.out.println("The search value was found at index " + (searchIndex));
    }
}
