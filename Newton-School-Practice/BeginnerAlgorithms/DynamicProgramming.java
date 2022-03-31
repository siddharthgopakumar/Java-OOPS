package BeginnerAlgorithms;


/**
 * Write a description of Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
class DynamicProgramming
{
     public int sumofDigits(int n)
     {
            int sum = 0;
            while(n>0)
            {
                sum = sum + n%10;
                n = n/10;
            }
            return sum;
     }
     public int[] reduceZero(int N)
     {
          int []dp = new int[N + 1];
          for (int i = 0; i <= N; i++)
            dp[i] = (int) 1e9;
           dp[0] = 0;
 

          for (int i = 0; i <= N; i++)
          {
 
             dp[i] = Math.min(dp[i], dp[i-sumofDigits(i)] + 1);
                             
        
          }
          return dp;
     }
     public  void main1()
     {
          Scanner scan =new Scanner(System.in);
          int numbers = scan.nextInt();
          ArrayList<Integer> aL = new ArrayList<>();
          for(int i = 0; i< numbers; i++)
          {
              int n = scan.nextInt();
              aL.add(n);
          }
          int max = Collections.max(aL);
          int[] arr2 = reduceZero(max);
          for(Integer i : aL)
          {
               System.out.println(arr2[i]);
          }
     }
}
    

