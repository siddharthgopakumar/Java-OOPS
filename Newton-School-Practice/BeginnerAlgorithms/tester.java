package BeginnerAlgorithms;


/**
 * Write a description of tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class tester {
    public void check()
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), start;
        int [] arr = new int[N];
        boolean toggle = true;
        for( int i=0; i< N; i++)
        {
            arr[i] = scan.nextInt();
        }
        for( int i=0; i<N-1; i++)
        {
            
           /* if( arr[i] >= arr[i+1])
            {
                *///System.out.println(arr[i] +" " + arr[i+1]);
                if(i ==0)
                {
                    start = 1;
                }
                else
                {
                    start = arr[i-1]+1;
                }
                for( int k = start; k < arr[i+1]; k++)
                {
                   //System.out.println(arr[i] + " " + k + (arr[i] % k != 0));
                    if(arr[i] % k == 0)
                    {
                        
                          arr[i] = k;
                    
                    }
                    
                }
                
                
            }
        
        for( int i=0; i< N-1; i++)
        {
            //System.out.print(arr[i] + " ");
            if(arr[i]>= arr[i+1])
               toggle = false;
        }
        if(toggle)
        System.out.println("YES");
        else
        System.out.println("NO");
        }
    }

