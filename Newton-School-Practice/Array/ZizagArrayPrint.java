package Array;


/**
 * Write a description of ZizagArrayPrint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZizagArrayPrint {
   public void zizagArrayPrint()
   {
       twoDArray tDArr = new twoDArray();
       int[][] arr= tDArr.scanTwoDArray();
       for(int i = 0; i < arr.length; i++)
       {
          if((i&1) == 1)
          {
              for(int j = arr[i].length - 1; j >=0; j --)
              {
                System.out.print(arr[i][j] + " ");
              }
          }
          else
          {
              for(int j =0; j < arr[i].length; j++)
              {
                  System.out.print(arr[i][j] + " ");
              }
          }
          System.out.println();
       }
   }
}
