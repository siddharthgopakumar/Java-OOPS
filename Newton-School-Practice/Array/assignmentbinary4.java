package Array;

/**
 * Write a description of assignmentbinary4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class assignmentbinary4 {
    public int smallerElements(int a[], int n, int x){

        int left =0, right = n-1, mid;
        if(x < a[0])
            return 0;
        if(x >= a[n-1])
            return n;

        while(left <= right)
        {
            mid = (left + right)/ 2;
            //System.out.println("left " + left + "right" + right + "mid " +mid);
            if(a[mid] == x)
            {
                return (mid + 1);

            }
            if(x > a[mid])
            {
                left = mid +  1;
                continue;
            }
            if(x < a[mid])
            {
                right = mid - 1;
            }
        }
        return left;
        //Enter your code here
    }

    public void tester()
    {
        int arr[] = {2, 5, 6, 11, 15};
        for(int i=0; i<116; i++)
            System.out.println("i " + i+ "\t" + smallerElements(arr, 5,i ));
    }
}
