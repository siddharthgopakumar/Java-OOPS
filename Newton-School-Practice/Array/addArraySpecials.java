package Array;


/**
 * Write a description of addArraySpecials here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class addArraySpecials {
    public int[] sumArraySpecials(int[] arr1, int[] arr2)
    {
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] sumOfArrays = new int[maxLength+1];
        int i = arr1.length - 1, j = arr2.length - 1, k = maxLength;
        while( k >= 0 )
        {
            int sum = 0;
            sum = sumOfArrays[k];
            if(i >= 0)
            {
                sum += arr1[i]; 
            }
            if(j >= 0)
            {
                sum += arr2[j];
            }
            if(sum >= 10)
            {
                sumOfArrays[k-1] = sum/10;
                sumOfArrays[k] = sum%10;
            }
            else
            {
                sumOfArrays[k] = sum;
            }
            i--;
            j--;
            k--;
        }
        return sumOfArrays;
    }
    public void tester()
    {
        binarySearch bS = new binarySearch();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the arrays you want to add one by one:");
        int n1 = scan.nextInt(), n2 =scan.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        bS.ArrayMaker(arr1);
        bS.ArrayMaker(arr2);
        bS.arrayPrinter(sumArraySpecials(arr1, arr2));
    }
}
