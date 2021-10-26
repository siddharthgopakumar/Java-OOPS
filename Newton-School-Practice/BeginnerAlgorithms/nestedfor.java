
/**
 * Write a description of nestedfor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class nestedfor {
public void fornest()
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 1;
        for( int i=0; i <= n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print((i+1)*(j+1));
                //count++;
            }
            System.out.println();
            //count = 1;
        }
    }
}
