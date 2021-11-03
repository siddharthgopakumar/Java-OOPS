
/**
 * Write a description of WordLengths here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
public class WordLengths {
    public void countWordLengths(FileResource resource, int[] counts)
    {
        for( String word : resource.words())
        {
            if(word.length() == 1 && !Character.isLetter(word.charAt(0)))
                 {continue;}
            if( Character.isLetter(word.charAt(0)))
            {
                if(Character.isLetter(word.charAt(word.length()-1)))
                {
                    if(word.length() >= 30)
                    {
                        counts[30]++;
                    }
                    else
                    {
                        counts[word.length()]++;
                    }
                }
                else
                {
                    word = word.substring(0,word.length()-1);
                    if(word.length() >= 30)
                    {
                        counts[30]++;
                    }
                    else
                    {
                        counts[word.length()]++;
                    }
                }
            }
            else
            {
                word = word.substring(1);
                if(Character.isLetter(word.charAt(word.length()-1)))
                {
                    if(word.length() >= 30)
                    {
                        counts[30]++;
                    }
                    else
                    {
                        counts[word.length()]++;
                    }
                }
                else
                {
                    word = word.substring(0, word.length()-1);
                    if(word.length() >= 30)
                    {
                        counts[30]++;
                    }
                    else
                    {
                        counts[word.length()]++;
                    }
                }
            }
        }
    }
    public int indexOfMax(int[] values)
    {
        int maxDex = 0;
        for(int i = 0; i< values.length; i++)
        {
            if( values[maxDex] < values[i])
            {
                maxDex = i;
            }
        }
        return maxDex;
    }
    public void tesCountWordLengths()
    {
        int[] counts = new int[31];
        FileResource resource = new FileResource();
        countWordLengths(resource, counts);
        for(int i = 1; i< counts.length; i++)
        {
            System.out.println(i + "=" + counts[i]);
        }
        System.out.println("The highest index is:" + indexOfMax(counts));
    }
}
