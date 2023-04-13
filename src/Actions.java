
package src;

import java.util.ArrayList;

public class Actions 
{
    BST tree;
    public void actions()
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
    public post ShowPosts(String accountName)
    {
        
    }
    


}
