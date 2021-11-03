
public class ObjectOrientedCaesarCipherII {
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private String shiftedAlphabet1;
    private String shiftedAlphabet2;
    private int mainKey1, mainKey2;
    public ObjectOrientedCaesarCipherII(int key1, int key2)
    {
        alphabet = "abcdefghijklmnopqrstuvwxyz";
        shiftedAlphabet1 = alphabet.substring(key1) + alphabet.substring(0, key1); 
        shiftedAlphabet2 = alphabet.substring(key2) + alphabet.substring(0, key2);
        mainKey1 = key1;
        mainKey2 = key2;
    }
    public String encrypt(String input)
    {
        StringBuilder encrypted = new StringBuilder(input);
        String input0 = halfOfString(input, 0), input1 = halfOfString(input, 1);
        int j = 0, k = 1;
        for(int i= 0; i < input0.length(); i++)
        {
            char ch = Character.toLowerCase(input0.charAt(i));
            int idx = alphabet.indexOf(ch);
            if(idx!= -1)
            { 
                if(Character.isUpperCase(encrypted.charAt(j)))
                {
                     ch = Character.toUpperCase(shiftedAlphabet1.charAt(idx)); 
                }
                else
                {
                     ch = shiftedAlphabet1.charAt(idx);
                }
                encrypted.setCharAt(j, ch);
            }
            j+=2;
        }
        for(int i= 0; i < input1.length(); i++)
        {
            char ch = Character.toLowerCase(input1.charAt(i));
            int idx = alphabet.indexOf(ch);
            if(idx!= -1)
            { 
                if(Character.isUpperCase(encrypted.charAt(k)))
                {
                     ch = Character.toUpperCase(shiftedAlphabet2.charAt(idx)); 
                }
                else
                {
                     ch = shiftedAlphabet2.charAt(idx);
                }
                encrypted.setCharAt(k, ch);
            }
            k+=2;
        }
        return encrypted.toString();
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
    public String decrypt(String input)
    {
        ObjectOrientedCaesarCipherII oCII = new ObjectOrientedCaesarCipherII(26 - mainKey1, 26- mainKey2);
        return oCII.encrypt(input);
    }
}