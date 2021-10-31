package BeginnerAlgorithms;


/**
 * Multiple N with the left most digit K times.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KOperationsOnN {
    public void KOperations()
    {
        long N = 3L, K = 22L;
        for(int i=0; i< K; i++)
        {
            long r = 0L;
            int digits = (int)(Math.ceil(Math.log10(N)));
            
            r = (long)(N / (Math.pow(10, digits-1)));
           if(r==1)
           break;
            N *= r;
        }
        System.out.print("\n\n"+ N);
    }
}

//char M = String.valueOf(N).toCharArray()[0];