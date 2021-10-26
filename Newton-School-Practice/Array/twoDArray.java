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
    int[][] arr = new int[3][2];
    System.out.println("Enter the array values");
    for( int i=0 ; i < 3 ; i++ )
    {
        for( int j=0 ; j<2 ; j++ )
        {
            arr[i][j] = scan.nextInt();
        }
    }
    System.out.println("The entered array is:");
     for( int i=0 ; i < 3 ; i++ )
    {
        for( int j=0 ; j<2 ; j++ )
        {
            System.out.print(arr[i][j]+ "\t");
        }
        System.out.println();
    }
    
}
}
