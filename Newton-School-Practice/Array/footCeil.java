package Array;


/**
 * Write a description of footCeil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class footCeil {
    public void funct()
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] a = new int[N];
        int foot = -1, ceil = -1;
        for(int i=0; i< N; i++)
        {
            a[i] = scan.nextInt();
        }
        int x = scan.nextInt();
        int left = 0, right = a.length-1, mid;
        while( left<= right )
        {
            mid = (left+ right)/2;
            if(x == a[mid])
            {
                foot = mid;
                ceil = mid;
                break;
            }
            if(x < a[mid])
            {
                if(mid - left == 1)
                {
                    if(x > a[left])
                    {
                        ceil = a[mid];
                        foot = a[left];
                        break;
                    }
                }
                right = mid;
            }
            if(x > a[mid])
            {
                if(right - mid == 1)
                {
                    if(x < a[right])
                    {
                        ceil = right;
                        foot = mid;
                    }
                }
            }
            
        }
        System.out.println(foot + " " + ceil);
    }

}
