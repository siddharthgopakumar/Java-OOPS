package BeginnerAlgorithms;


/**
 * Write a description of tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class recursionexample {
    
     public double pow(double x, int y)
    {
        if (y == 0)
            return 1;
        else if (y % 2 == 0)
            return pow(x, y / 2) * pow(x, y / 2);
        else
            return x * pow(x, y / 2) * pow(x, y / 2);
    }
    public void rok()
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        double[][] arr = new double[T][2];
        for(int i=0; i<T; i++)
        {
            for(int j=0; j<2; j++)
            {
                arr[i][j] = scan.nextDouble();
            }
        }
        for(int i=0; i<T; i++)
        {
            
              if(arr[i][1] < 0)
              {
                   System.out.format("%.2f", pow((1/arr[i][0]), (int)arr[i][1]));
                   System.out.println();
              }
              else
              {
                  System.out.format("%.2f", pow(arr[i][0], (int)arr[i][1]));
                  System.out.println();
              }
            
        }
        
    }
}
