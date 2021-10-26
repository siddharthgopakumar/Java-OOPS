package Array;


/**
 * Write a description of binarySearch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class binarySearch {
    public int binarySearch(int[] arr, int searchValue)
    {
        int left = 0, right = arr.length, mid;
        for (int i= 0; i< arr.length; i++)
        {
            mid = left + right/ 2;
            if(arr[mid] == searchValue)
            {
                return mid;
            }
            if(searchValue > arr[mid])
            {
                left = mid +  1;
            }
            if(searchValue < arr[mid])
            {
                right = mid - 1;
            }
        }
        return -1;
    }
    public int[] ArrayMaker(int arr[])
    {
        Scanner scan  = new Scanner(System.in);
        arr[0]  = scan.nextInt();
        int curr = 0; 
        for( int i = 1; i < arr.length ; i++)
        {
            arr[i] = scan.nextInt();
        }
        return arr;
    }
    public void arrayPrinter(int arr[])
    {
        System.out.println("The array is:");
        for( int i = 0; i < arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public int[] arraySorter(int arr[])
    {
        for(int i=0; i <arr.length; i++)
        {
            for( int j = i+1; j < arr.length; j++)
            {
               if(arr[i] > arr[j])
               {
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] =temp;
               }
            }
        }
        return arr;
    }
    public void tester()
    {
        Scanner scan  = new Scanner(System.in);
        int arr[] = new int[5];
        arr = ArrayMaker(arr);
        arr = arraySorter(arr);
        System.out.println("Array after sorting is:");
        arrayPrinter(arr);
        System.out.println("Enter the value you want to search in the array:");
        int searchValue = scan.nextInt();
        System.out.println("The searched vale was found at index:" + binarySearch(arr, searchValue));
    }
}
