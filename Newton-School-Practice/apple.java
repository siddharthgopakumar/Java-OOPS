
/**
 * Write a description of apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */import java.util.Scanner;
public class apple {
public void Pattern(){
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
     int c= 0, b= 0;
for(int i = 0; i < N; i++)
{
    for(int j = 0; j < N; j++)
{  System.out.print( "*" +(b )+ (c) + "$");
    
    if( j == 0)
    {c = b + c;
    System.out.print(c + " ");}
    else
    {c = c + 4;
    System.out.print(c + " ");}
    
    }
    b = b + 6;
    c = 0;
    System.out.println();
    }
}
}
