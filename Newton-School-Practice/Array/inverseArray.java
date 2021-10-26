package Array;


/**
 * Write a description of inverseArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class inverseArray {
    public int[] inverseArray( int[] arr )
    {
        int[] inverseArray = new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            inverseArray[arr[i]] = i;
        }
        return inverseArray;
    }
    public void tester()
    {
        binarySearch bS = new binarySearch();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= scan.nextInt();
        int[] arr = new int[n];
        bS.ArrayMaker(arr);
        bS.arrayPrinter(inverseArray(arr));
    }
}
