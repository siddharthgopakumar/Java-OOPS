package Array;


/**
 * Write a description of ReverseOfArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class ReverseOfArray {
   public int[] arrayReverser(int[] arr) 
   {
       int p = arr.length-1;
       for( int i= 0; i <= (arr.length - 1)/2; i++)
       {
           int temp = arr[i];
           arr[i] = arr[p];
           arr[p] = temp;
           p --;
       }
       return arr;
   }
   public void tester()
   {
      binarySearch bS = new binarySearch();
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the size of the array ");
      int n = scan.nextInt();
      int[] arr = new int[n];
      bS.ArrayMaker(arr);
      arrayReverser(arr);
      bS.arrayPrinter(arr);
   }
}
