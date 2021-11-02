package BeginnerAlgorithms;


/**
 * Write a description of tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class tester {
    
    public void tester()
    {
         Scanner scan = new Scanner(System.in);
			int T = scan.nextInt();
			int[] arr = new int[T];
			for( int i=0; i < T; i++)    
			{
				int face = scan.nextInt();
				switch(face)
			{	
				case 1:
				arr[i] = 6;
				break;
				case 2:
				arr[i] = 5;
				break;
				case 3:
				arr[i] = 4;
				break;
				case 4:
				arr[i] = 3;
				break;
				case 5:
				arr[i] = 2;
				break;
				case 6:
				arr[i] = 1;
			}
			}
			for( int i=0; i < T; i++) 
                  {System.out.println(arr[i]);}
    }
}
