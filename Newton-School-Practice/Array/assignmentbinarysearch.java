package Array;


/**
 * Write a description of assignmentbinarysearch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class assignmentbinarysearch {
    public void floorAndCeil(int a[], int N, int x)
    {
        int left =0, right = N-1, mid;
        while(left < right)
        {
            mid = left + right/ 2;
            if(a[mid] == x)
            {
                System.out.println(a[mid] +" "+ a[mid]);
            }
            if(x > a[mid])
            {
                left = mid +  1;
            }
            if(x < a[mid])
            {
                right = mid - 1;
            }
        }
        System.out.println(a[right] + " "+ a[left]);
}

public void tester()
{
    int[] arr = {2, 5, 6, 11, 15};
    floorAndCeil(arr, 5, 8);
}
}
