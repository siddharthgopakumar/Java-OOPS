
/**
 * Write a description of Reversingnumber2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.String;
public class Reversinganumber2 {
    public void reversingANumber( )
    {
        int r, n = 0; String q;
          
        Scanner scan = new Scanner(System.in);
        q = scan.next();
        char a[] = q.toCharArray();
        String rev = "";
        for(int i= q.length()-1; i>=0; i--)
        {  
            rev+= a[i];  
        }
        n = Integer.parseInt(rev);
        System.out.println("The reversed number is " + n);    
    }
}

