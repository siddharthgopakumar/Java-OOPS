
/**
 * Write a description of DiceRolling here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class DiceRolling {
    
    public void simulate(int rolls)
    {
        Random rand = new Random();
        int[] counts = new int[13];
        for(int i = 0; i< rolls; i++)
        {
            int d1 = rand.nextInt(6) + 1;
            int d2 = rand.nextInt(6) + 1;
            counts[d1+d2] += 1;
        }
        for(int i = 2; i<=12; i++)
        {
        System.out.println( i + "'s=\t" +counts[i] + "\t"+ 100* counts[i] / rolls );
        }
    }
    }

