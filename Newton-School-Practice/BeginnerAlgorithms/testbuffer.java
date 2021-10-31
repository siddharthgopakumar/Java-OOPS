package BeginnerAlgorithms;


/**
 * Write a description of testbuffer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class testbuffer {

      public int HCF(int N, int P)
      {if(N == 0 || P == 0)
         return Math.max(N,P);
         if(N%P == 0 || P%N ==0)
         return Math.min(N,P);
         int M = Math.min(N,P), temp = 1;
for(int i=2;i<=M;i++){
if(N%i==0 && P%i==0){
temp = i;
}
}
return 1;
        }
}
