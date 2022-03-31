package Array;


/**
 * Write a description of SearchInSortedArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class SearchInSortedArray {
    public int[] searchInSortedArray(int[][] arr, int searchVal)
    {
        int rMin = 0,rMax = arr.length - 1,cMin = 0,cMax = arr.length -1, count = 0;
        int[] rArr = {-1, -1};
        
        if( searchVal < arr[rMin][cMin] || searchVal > arr[rMax][cMax])
        {
            
            return rArr;
        }
        else
        {
            while(cMax >= cMin && rMin <= rMax)
            {
                if(searchVal < arr[rMin][cMax]  )
                {
                    cMax--;
                }
                else if(searchVal > arr[rMin][cMax]   )
                {
                    rMin++;
                }
                else
                {
                    rArr[0] = rMin;
                    rArr[1] =  cMax;
                    return rArr;
                }
                count++;
            }
        }
        return rArr;
    }
    public void tester()
    {
        Scanner scan = new Scanner(System.in);
        twoDArray tDA = new twoDArray();
        int[][] arr = tDA.scanTwoDArray();
        System.out.println("Enter the search value");
        int searchVal = scan.nextInt();
        int[] index = searchInSortedArray(arr, searchVal);
        System.out.println("The search value was found at locations " + index[0] + " and " + index[1] + ".");
    }
}
