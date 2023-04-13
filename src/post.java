package src;
public class post 
{
    String title;
    String nameOfVideo;
    int numOfLikes;
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
