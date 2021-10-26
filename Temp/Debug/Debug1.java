
/**
 * Write a description of Debug1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Debug1 {
public void findAbc(String input) {
    int index = input.indexOf("abc");
    while (true) {
        if (index == -1) {
            break;
        }
        System.out.println("Index+1 and Index+4 is: " +(index+1) + ", " + (index+4) +" respectively.");
        String found = input.substring(index+1, index+4);
        System.out.println(found);
        index = input.indexOf("abc", index+4);
    }
}
   public void test() {
   //findAbc("abcd"); //no code yet
   findAbc("abcdabc");
}
}
