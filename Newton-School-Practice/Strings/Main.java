package Strings;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static String longestString(String[] a)
    {
        int size = a.length;
       if (size == 0)
            return "";
 
        if (size == 1)
            return a[0];
         Arrays.sort(a);
        int end = Math.min(a[0].length(), a[size-1].length());
         int i = 0;
        while (i < end && a[0].charAt(i) == a[size-1].charAt(i) )
            i++;
 
        String pre = a[0].substring(0, i);
        return pre;
    }
	public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int N =scan.nextInt();
        scan.nextLine();
        String testString = scan.nextLine();
        String ans = longestString(testString.split(" "));
        System.out.println((ans.equals(""))? -1: ans);        // Your code here
	}
}