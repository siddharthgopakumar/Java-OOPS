package Array;


/**
 * Write a description of twoDArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class twoDArray {
public int[][] scanTwoDArray()
{
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two D array size");
    int nArr1 = scan.nextInt();
    int nArr2 = scan.nextInt();
    int[][] arr = new int[nArr1][nArr2];
    System.out.println("Enter the array values:");
    for( int i=0 ; i < nArr1 ; i++ )
    {
        for( int j=0 ; j < nArr2 ; j++ )
        {
            arr[i][j] = scan.nextInt();
        }
    }
    return arr;
}
public void printTwoDArray( int[][] arr)
{
    int row= arr.length;
    int column = arr[0].length;
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
public void twoDArray()
{
    int[][] arr = scanTwoDArray();
    printTwoDArray(arr);
}
}
