package BeginnerAlgorithms;


/**
 * Write a description of hanoi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hanoi {

    public void hanoi(int a, char A, char B, char C)
    {
        if(a==1)
        {
            System.out.println(1+":" + A + "->" + C);
            return;
        }
        else
        {
            hanoi(a-1, A, C, B);
            System.out.println(a+":"+A+"->"+C);
            hanoi(a-1, B, A, C);
        }
    }
    public void tester()
    {
        int n = 2;
        hanoi(2, 'A', 'B', 'C');
    }
}
