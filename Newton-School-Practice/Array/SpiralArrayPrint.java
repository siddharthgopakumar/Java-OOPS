package Array;


/**
 * Write a description of ZizagArrayPrint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpiralArrayPrint {
   public void spiralArrayPrint()
   {
       twoDArray tDArr = new twoDArray();
       int[][] arr= tDArr.scanTwoDArray();
       int k = 0, p = arr[0].length - 1, l = arr.length - 1, count = 0;
       while( count < arr.length * arr[0].length )
       {
           int j = k, i;
           for(i = k; i <= l; i++)
           {
               System.out.print(arr[i][j]  + " ");
               count++;
           }
           i--; 
           for( j = k+1; j <= p; j++)
           {
               
                  System.out.print(arr[i][j]  + " ");
                  count++;
           }
           j--;
           for(i = l-1; i >= k; i--)
           {
               System.out.print( arr[i][j]  + " ");
               count++;
           }
           i++;
           for( j = p-1; j >= k+1; j--)
           {
               
                   System.out.print(arr[i][j] + " ");
                   count++;
           }
           k++;
           p--; 
           l--;
           
        }
   }
}
