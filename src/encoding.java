package src;
import src.Account; 
import src.Actions; 
import src.BST;
import src.encoding;
import src.post;
import java.math.BigInteger;

public class encoding 
{
    
    /**
     * The function encodes a given string by converting each character to its ASCII value and
     * concatenating them into a BigInteger.
     * 
     * @param name The input parameter "name" is a string that represents the name that needs to be
     * encoded.
     * @return The method is returning a BigInteger object which represents the encoded value of the
     * input string.
     */
    public static BigInteger encode(String name)
    {
    String code_string = "";
        for (int i = 0;i<name.length();i++)
        {
            char character = name.charAt(i);
            int characterAscii = ((int) character);
            String characterAsciiString = Integer.toString(characterAscii);
            code_string = code_string + characterAsciiString;
        }
        BigInteger finalCode = new BigInteger(code_string);
        return finalCode;
    }

}
