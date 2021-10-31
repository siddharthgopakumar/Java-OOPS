package BeginnerAlgorithms;


/**
 * Write a description of sumof here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sumOfDigits {
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
}
