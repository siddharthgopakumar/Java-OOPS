package Array;


/**
 * Write a description of declaringandprinting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class declaringandprinting {
    public void basics()
    {
        Scanner scan = new Scanner(System.in);
        int marks[] = new int[5];
        for(int i = 0; i < marks.length; i++)
        {
            System.out.println("Enter the marks for student " + (i + 1) );
            marks[i] = scan.nextInt();
        }
        for(int i = 0; i < marks.length; i++)
        {
            System.out.println("Marks scored by student " + (i + 1) + " is " + marks[i]  );
        }
    }
}
