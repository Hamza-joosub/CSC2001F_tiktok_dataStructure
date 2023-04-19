package src;
import src.Account; 
import src.Actions; 
import src.BST;
import src.encoding;
import src.post;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Account 
{
    private String name;
    private BigInteger code;
    private String description;
    Account left;
    Account right;
    private ArrayList<post> posts;
    int searchCount = 0;

    // This is a constructor method for the `Account` class that takes in two parameters: `name` and
    // `description`. It initializes the `name` and `description` instance variables of the `Account`
    // object with the values passed in as parameters. It also initializes the `posts` instance
    // variable as a new empty `ArrayList` of `post` objects.
    public Account(String name, String description)
    {
        this.name = name;
        this.description = description;
        this.posts = new ArrayList<>();
    }
    /**
     * This function adds a new post to a list of posts with a given title, name of video, and number
     * of likes.
     * 
     * @param title The title of the post being added.
     * @param nameOfVideo The name or title of the video that is being added to the post.
     * @param numOfLikes numOfLikes is an integer variable that represents the number of likes a post
     * has received.
     */
    public void addPost(String title, String nameOfVideo, int numOfLikes)
    {
        posts.add(new post(title,nameOfVideo,numOfLikes));
    }
    /**
     * This function returns a string representation of the posts in reverse order.
     * 
     * @return The method is returning a string representation of the most recent post in the "posts"
     * collection. If there are no posts, it will return null.
     */
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
    public int getSearchCount()
    {
        return searchCount;
    }
    public void incrementSearchCount()
    {
        searchCount = searchCount+1;
    }
    


}
