package BeginnerAlgorithms;


/**
 * Write a description of test2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class ArrayListExample {

    public void tester()
    {
        Scanner scan =new Scanner(System.in);
      List<Integer> list1 = new ArrayList<>();
      int count =0;
      while(true)
      {
          int n = scan.nextInt();
          list1.add(n);
          count ++;
          if(n == 0)
          break;
      }
      for(int i = 0; i < count; i++)
      {System.out.print(list1.get(i) + " ");}
    }
    }


