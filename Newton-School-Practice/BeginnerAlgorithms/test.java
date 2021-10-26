package BeginnerAlgorithms;


/**
 * Write a description of test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test {
    public int memory(int M, int K, int N)
       {
      if(M>K*N)
      {return -1;}
      else
      {
        if(M%K == 0)
        {return M/K;}
        else
        {return M/K+1;}
      }
     }
      
    public void tester()
    {
        System.out.println(memory(10,2,5));
        System.out.println(memory(10,2,4));
        System.out.println(memory(10,2,10));
        System.out.println(memory(40,3,10));
        System.out.println(memory());
    }
}
