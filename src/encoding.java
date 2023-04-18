package src;

import java.math.BigInteger;

public class encoding 
{
    public static BigInteger encode(String name)
    {
    String code_string = "";
        for (int i = 0;i<name.length();i++)
        {
            char character = name.charAt(i);
            int characterAscii = ((int) character);
            String characterAsciiString = Integer.toString(characterAscii);
            String seperatorString = "~";
            int separatorAscii = ((int) seperatorString.charAt(0));
            code_string = code_string + separatorAscii + characterAsciiString;
        }
        BigInteger finalCode = new BigInteger(code_string);
        return finalCode;
    }

}
