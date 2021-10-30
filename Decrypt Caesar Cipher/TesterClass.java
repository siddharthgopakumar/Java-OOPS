
/**
 * Write a description of TesterClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.*;
public class TesterClass {
    public void simpleTest()
    {
         ObjectOrientedCaesarCipher cc1 = new ObjectOrientedCaesarCipher(1);
         System.out.println("Enter the string you want to encrypt:");
         Scanner scan = new Scanner(System.in);
         String message = scan.nextLine();
         System.out.println(cc1.encrypt(message));
    }
}
