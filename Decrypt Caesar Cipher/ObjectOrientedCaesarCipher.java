
/**
 * Write a description of ObjectOrientedCaesarCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObjectOrientedCaesarCipher {
    private String alphabet;
    private String shiftedAlphabet;
    private int mainKey;
    public ObjectOrientedCaesarCipher(int key)
    {
        alphabet = "abcdefghijklmnopqrstuvwxyz";
        shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0,key);
        mainKey = key;
    }
    public String encrypt(String input)
    {
        StringBuilder encrypted = new StringBuilder(input);
        for(int i=0; i < encrypted.length(); i++)
        {
            char ch = Character.toLowerCase(encrypted.charAt(i));
            int idx = alphabet.indexOf(ch);
            if(idx!= -1)
            { 
                if(Character.isUpperCase(encrypted.charAt(i)))
                {
                     ch = Character.toUpperCase(shiftedAlphabet.charAt(idx)); 
                }
                else
                {
                     ch = shiftedAlphabet.charAt(idx);
                }
                encrypted.setCharAt(i, ch);
            }
        }
        return encrypted.toString();
    }
    public String decrypt(String input)
    {
        ObjectOrientedCaesarCipher ooCC = new ObjectOrientedCaesarCipher(26 - mainKey);
        return ooCC.encrypt(input);
    }
}
