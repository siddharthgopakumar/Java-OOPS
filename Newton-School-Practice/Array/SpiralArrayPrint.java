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
       int k = 0, p = arr[0].length - 1, l = arr.length - 1;
       while( k <= p)
       {
           int j = k, i;
           for(i = k; i <= l; i++)
           {
               System.out.print(arr[i][j]  + " ");
           }
           i--; 
           for( j = k+1; j <= p; j++)
           {
               
                   System.out.print(arr[i][j]  + " ");
               
           }
           j--;
           for(i = p-1; i >= k; i--)
           {
               System.out.print( arr[i][j]  + " ");
               
           }
           i++;
           for( j = l-1; j >= k+1; j--)
           {
               
                   System.out.print(arr[i][j] + " ");
               
           }
           k++;
           p--; 
           l--;
           
        }
   }
}
