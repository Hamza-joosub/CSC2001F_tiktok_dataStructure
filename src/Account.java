package src;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Account 
{
    String name;
    BigInteger code;
    String description;
    Account left;
    Account right;
    ArrayList<post> posts;

    public Account(String name, String description)
    {
        this.name = name;
        this.description = description;
        this.posts = new ArrayList<>();
    }
    public void addPost(String title, String nameOfVideo, int numOfLikes)
    {
        posts.add(new post(title,nameOfVideo,numOfLikes));
    }
    public String showPosts()
    {   
        Collections.reverse(posts);
        for (post i : posts) 
        {
            return i.toString();
        } 
        return null;
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
