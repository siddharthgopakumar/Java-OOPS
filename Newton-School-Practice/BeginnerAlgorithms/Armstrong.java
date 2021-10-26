
/**
 * Write a description of Armstrong here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Armstrong {
    public int numberOfDigits(int n)
    {
        int count =1;
        while( n > 10 )
        {
            n = n/10;
            count++;
        }
        return count;
    }
    public int poweringNos( int count, int r)
    {
        int product = 1;
        for( int i =0; i < count; i++)
        {
            product = product * r;
        }
        return product;
    }
    public boolean isArmstrong(int n)
    {
        int count = numberOfDigits(n);
        int t = n;
        int sum = 0;
        while( t != 0 )
        {
            int r = t%10;
            t = t/10;
            sum = sum + poweringNos( count, r);
        }
        return (sum == n)? true: false ;
    }
    public void testArmstrong()
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(isArmstrong(n));
    }
}
