
/**
 * Write a description of timecalc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class timecalc {
    public int calctime(int A, int B, int S)
    {
        return A>B? (A-B)/S : (B-A)/S;
    
    }
    public void testcalctime()
    {
        System.out.println(calctime(5,2,3));
        System.out.println(calctime(2,5,3));
        System.out.println(calctime(5,5,3));
        System.out.println(calctime(9,1,1));
    }
}
