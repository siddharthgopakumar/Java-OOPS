package ExampleCode;
import java.util.Random;

/**
 * Write a description of RandomDice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DiceRolling 
{
    public void simulate(int rolls)
    {
        Random rand = new Random();
        int[] counts = new int[13];
        for(int i = 0; i < rolls; i++)
        {
            int d1 = rand.nextInt(6) + 1;
            int d2 = rand.nextInt(6) + 1;
            System.out.println(d1 + " - " + d2);
        }
    }

    
}
