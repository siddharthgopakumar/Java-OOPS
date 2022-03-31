package BeginnerAlgorithms;


/**
 * Write a description of recursionSumofProducts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class recursionSumofProducts {
    public int sumProd(int a, int b)
    {
        if(a<10 && b<10)
        return a*b;
        else
        return sumProd(a%10, b%10) + sumProd(a/10, b/10);
    }
    public void tester()
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt();
        System.out.println(sumProd(a,b));
    }
}
