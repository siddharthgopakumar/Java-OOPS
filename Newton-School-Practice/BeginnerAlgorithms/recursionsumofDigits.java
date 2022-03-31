package BeginnerAlgorithms;


/**
 * Write a description of recursionmine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class recursionsumofDigits {
    public int sumdigits(int a)
       {
           if(a < 10)
               return a;
           else
               return sumdigits(a%10) + sumdigits(a/10);
    
    }
    public void tester()
    {
        System.out.println(sumdigits(325));
    
    }
 }   

