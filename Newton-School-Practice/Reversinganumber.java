
/**
 * Write a description of Reversinganumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Reversinganumber {
    public void reversingANumber( )
    {
        int r, n = 0, q;
        Scanner scan = new Scanner(System.in);
        q = scan.nextInt();
        while(true)
        {
            r = q % 10;
            q = q / 10;
            n = r + 10 * n;
            if( q < 10)
            {
                r = q;
                n = r + 10 * n;
                break;
            }
        }
        System.out.println("The reversed number is " + n);    
    }
}
