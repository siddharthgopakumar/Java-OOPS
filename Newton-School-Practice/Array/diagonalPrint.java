package Array;


/**
 * Write a description of diagonalPrint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class diagonalPrint {
    public void diagonalPrint()
    {
        twoDArray twoDA = new twoDArray();
        int[][] arr = twoDA.scanTwoDArray();
        int count = 0;
        while(count < arr[0].length)
        {
            int col = count;
            for(int row = 0; col < arr[0].length; row++)
            {
                System.out.print(arr[row][col] + " ");
                col++;
            }
            count++;
        }
    }
}
