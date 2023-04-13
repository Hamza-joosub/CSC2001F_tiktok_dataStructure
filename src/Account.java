package src;

import java.math.BigInteger;
import java.util.ArrayList;

public class Account 
{
    String name;
    BigInteger code;
    String description;
    Account left;
    Account right;

    public Account(String name, String description, ArrayList<post>... posts)
    {
        this.name = name;
        this.description = description;
    }
    public BigInteger getCode()
    {
        return code;
    }
    public String getName()
    {
        return name;
    }
    public String getDescription()
    {
        return description;
    }
    public Account getLeft()
    {
        return left;
    }
    public Account getRight()
    {
        return right;
    }


}
