package BeginnerAlgorithms;


/**
 * Write a description of recursionexample2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class recursionexample2 {
    public void towerOfHanoi(int n , char from_rod, char to_rod, char aux_rod, int count)
    { 
        if(n == 1)
         {
               System.out.println(count + " " + from_rod+ "->" + to_rod);
               return;
         }
         
         towerOfHanoi(n-1, from_rod, aux_rod, to_rod, count+=1);
         System.out.println( count + " "+ from_rod+"->"+to_rod);
         towerOfHanoi(n-1, aux_rod, to_rod, from_rod, count+=1);
    }
    public void tester()
    {
        int n=2;
        int count = 1;
        towerOfHanoi(2, 'A','B','C', count+=1);
    }
}
