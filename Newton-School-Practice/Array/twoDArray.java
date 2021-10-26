package Array;


/**
 * Write a description of twoDArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class twoDArray {
public void twoDArray()
{
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the row and column numbers");
    int row =scan.nextInt(), column = scan.nextInt();
    int[][] arr = new int[row][column];
    System.out.println("Enter the array values");
    for( int i=0 ; i < row ; i++ )
    {
        for( int j=0 ; j < column ; j++ )
        {
            arr[i][j] = scan.nextInt();
        }
    }
    System.out.println("The entered array is:");
     for( int i=0 ; i < row ; i++ )
    {
        for( int j=0 ; j < column ; j++ )
        {
            System.out.print(arr[i][j]+ "\t");
        }
        System.out.println();
    }
    
}
}
