
/**
 * Write a description of WordFrequencies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.*;
public class WordFrequencies {
    private ArrayList<String> myWords;
    private ArrayList<Integer> myFreqs;
    public WordFrequencies()
    {
        myWords = new ArrayList<String>();
        myFreqs = new ArrayList<Integer>();
    }

    public void findUnique()
    {
        myWords.clear();
        myFreqs.clear();
        FileResource fR = new FileResource();
        for( String word : fR.words())
        {
            int idx = myWords.indexOf(word.toLowerCase());
            if(idx == -1)
            {
                myWords.add(word.toLowerCase());
                myFreqs.add(1);
            }
            else
            {
                int value = myFreqs.get(idx);
                myFreqs.set(idx, value + 1);
            }
        }
    }

    public int findIndexOfMax()
    {
        int max = 0;
        for( int curr : myFreqs)
        {
            if(curr > max)
            {
                max = curr;
            }
        }
        return myFreqs.indexOf(max);
    }

    public void tester()
    {
        findUnique();

        for( int k = 0; k < myWords.size(); k++)
        {
            System.out.println( myWords.get(k) + "\t" + myFreqs.get(k) );
        }
        System.out.println( "The word that occurs most often is " + myWords.get(findIndexOfMax()) + ", and it's count is " + myFreqs.get(findIndexOfMax()) + ".");
        System.out.println("Number of unique words: " + myWords.size());
    }
}
