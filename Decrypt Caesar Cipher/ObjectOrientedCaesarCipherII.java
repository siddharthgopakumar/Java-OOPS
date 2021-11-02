
public class ObjectOrientedCaesarCipherII {
    public int[] countLetters(String message)
    {
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] counts = new int[26];
        for(int k=0; k< message.length(); k++)
        {
            char ch= Character.toUpperCase(message.charAt(k));
            int dex = alph.indexOf(ch);
            if(dex != -1)
            {counts[dex] += 1;
            //System.out.println(counts[dex] + "= "+ ch );
            }
        }
        return counts;
        }
     public int maxIndex(int[] vals)
        {
        int maxDex = 0;
        for(int k=0;k< vals.length; k++)
        {
            if(vals[k] > vals[maxDex])
            {
                maxDex = k;
            }
        }
        return maxDex;
    }
    public String halfOfString(String message, int start)
    {
        StringBuilder messageSB = new StringBuilder();
        for(int i=start; i< message.length(); i+=2)
        {
            messageSB.append(message.charAt(i));
        }
        return messageSB.toString();
    }
    

}