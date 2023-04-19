package src;
import src.Account; 
import src.Actions; 
import src.BST;
import src.encoding;
import src.post;
/**
 * The "post" class represents a post with a title, name of video, and number of likes.
 */
public class post 
{
    private String title;
    private String nameOfVideo;
    private int numOfLikes;
    public post(String title, String nameOfVideo, int numOfLikes)
    {
        this.title = title;
        this.nameOfVideo = nameOfVideo;
        this.numOfLikes = numOfLikes;
    }
    public String toString()
    {
        return "Title: " + title + "\n" +
        "Video: " + nameOfVideo + "\n" +
        "Number of Likes: " + numOfLikes + "\n" ;
    }
}
