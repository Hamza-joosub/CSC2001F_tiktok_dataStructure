
package src;
import src.Account; 
import src.Actions; 
import src.BST;
import src.encoding;
import src.post;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Actions class contains methods for creating, listing, and deleting accounts, adding posts to
 * accounts, and displaying account descriptions and posts.
 */
public class Actions 
{
    BST tree;
    public Actions()
    {
        tree = new BST();
    }
    public void createAccount(String name, String description)
    {
        tree.insert(new Account(name, description));
    }
    public void listAccounts()
    {
        tree.display();
    }
    public String ShowDescriptionOfAccount(String accountName)
    {
        tree.search(accountName).incrementSearchCount();
        return tree.search(accountName).getDescription();
    }
    public void addPost(String accountName, String title, String postName, int numOfLikes)
    {
        tree.search(accountName).addPost(title, postName, numOfLikes);
    }
    public String ShowPosts(String accountName)
    {
        tree.search(accountName).incrementSearchCount();
        return tree.search(accountName).showPosts();
    }
    public void deleteAccount(String name)
    {
        tree.delete(name);
    }
    public String findTopSearchedAccounts()
    {
        tree.findTopSearchedAccounts();
        return tree.get1st() + "\n";
    }


}
