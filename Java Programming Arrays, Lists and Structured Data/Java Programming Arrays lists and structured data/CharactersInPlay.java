
/**
 * Write a description of CharactersInPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.*;
public class CharactersInPlay {
    private ArrayList<String> charNames;
    private ArrayList<Integer> charCounts;
    public CharactersInPlay()
    {
        charNames = new ArrayList<String>();
        charCounts = new ArrayList<Integer>();
    }
    
    public void update( String person )
    {
        int idx = charNames.indexOf(person);//.toUpperCase());
        if( idx == -1)
        {
            charNames.add(person); 
            charCounts.add(1);
        }
        else
        {
            int value = charCounts.get(idx);
            charCounts.set(idx, value + 1);
        }
    }

    public void findAllCharacters()
    {
        FileResource fR = new FileResource();
        for(String line: fR.lines())
        {
            if(line.indexOf(".") != -1)
            {
                String person = line.substring(0, line.indexOf("."));
                update(person);
            }
        }
    }
    
    public void tester()
    {
        findAllCharacters();
        for(int i = 0 ; i < charNames.size() ; i++ )
        {
            if( charCounts.get(i) > 1)
            {
                System.out.println( charNames.get(i) + " " + charCounts.get(i));
            }
        }
        charactersWithNumParts( 10 , 15 );
    }
    
    public void charactersWithNumParts( int num1, int num2)
    {
        System.out.println("characters with speakeing parts greater than" + num1 + " and less than " + num2 +" are:");
        for(int i = 0 ; i < charNames.size() ; i++ )
        {
            if( charCounts.get(i) >= num1 && charCounts.get(i) <= num2 )
            {
                System.out.println( charNames.get(i) + " " + charCounts.get(i));
            }
        }
        
    }
}
