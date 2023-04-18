
package src;

import java.util.ArrayList;

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
        return tree.search(accountName).getDescription();
    }
    public void addPost(String accountName, String title, String postName, int numOfLikes)
    {
        tree.search(accountName).addPost(title, postName, numOfLikes);
    }
    public String ShowPosts(String accountName)
    {
        return tree.search(accountName).showPosts();
    }
    public void deleteAccount(String name)
    {
        tree.delete(name);
    }


}
