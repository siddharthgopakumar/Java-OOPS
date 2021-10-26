
/**
 * Write a description of Debug2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Debug2 {
public void findAbc(String input){
       int index = input.indexOf("abc");
       while (true){
           if (index == -1 || index >= input.length() - 3){
               break;
           }
           System.out.println("Index+1: " + (index+1) +" Index+4: " + (index+4));
           String found = input.substring(index+1, index+4);
           System.out.println(found);
           System.out.println("Index before updating " + index);
           index = input.indexOf("abc",index+3);
           System.out.println("Index after updating " + index);
       }
   }

   public void test(){
       //findAbc("abcd");
       //findAbc("abcdabc");
       //findAbc("abcdkfjsksioehgjfhsdjfhksdfhuwabcabcajfieowj");
       findAbc("abcabcabcabca");
   }
}
