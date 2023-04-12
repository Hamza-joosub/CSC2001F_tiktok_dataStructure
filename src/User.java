package src;

import java.util.ArrayList;

public class User 
{
    int code;
    String name;
    String Description;
    ArrayList<post> posts = new ArrayList<post>(1);
    User left = null;
    User right = null;
    
    
    public User(String name, String Description,ArrayList<post>... posts)
    {
        this.name = name;
        this.Description = Description;
        this.posts.equals(posts);
    }
    public String getName()
    {
        return name;
    }
    public int getCode()
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
    public void setCode(int newCode)
    {
        code = newCode;
    }
    public setLeft(User userLeft)
    {
        left = userLeft;
    }
    public setRight(User userRight)
    {
        right = userRight;
    }


}
