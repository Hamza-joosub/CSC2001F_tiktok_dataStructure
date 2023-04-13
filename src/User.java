package src;

import java.math.BigInteger;
import java.util.ArrayList;

public class User 
{
    BigInteger code;
    String name;
    String Description;
    ArrayList<post> posts = new ArrayList<post>(1);
    User left = null;
    User right = null;
    
    
    public User(String name, String Description,ArrayList<post>... posts)
    {
        code = encoding.encode(name);
        this.name = name;
        this.Description = Description;
        this.posts.equals(posts);
    }
    public String getName()
    {
        return name;
    }
    public BigInteger getCode()
    {
        return code;
    }
    public User getLeft()
    {
        return left;
    }
    public User getRight()
    {
        return right;
    }
    public void setLeft(User userLeft)
    {
        left = userLeft;
    }
    public void setRight(User userRight)
    {
        right = userRight;
    }


}
