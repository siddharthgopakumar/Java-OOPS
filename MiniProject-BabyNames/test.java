
/**
 * Write a description of test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test {
public void test()
{
    String i = "yob2013.csv";
    int year =Integer.parseInt(i.substring(i.indexOf("b")+1,i.indexOf("s",i.indexOf("b"))));
    System.out.println(year);
}
}
