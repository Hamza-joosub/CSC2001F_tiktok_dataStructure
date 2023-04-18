
package src;

import java.util.ArrayList;

public class Actions 
{
    BST tree;
    public Actions()
    {
        tree = new BST();
    }
    public void createAccount(Account account)
    {
        tree.insert(account);
    }
    public String listAccounts()
    {
        return tree.display();
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
