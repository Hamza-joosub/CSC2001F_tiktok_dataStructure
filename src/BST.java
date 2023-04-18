package src;
import java.math.BigInteger;
public class BST 
{
    Account root;
    public void insert(Account account)
    {
        root = insertHelper(root, account);
    }
    private Account insertHelper(Account root, Account account)
    {
        if(root == null)
        {
            root = account;
            return root;
        }
        else if(encoding.encode(account.getName()).compareTo(encoding.encode(root.getName())) < 0)
        {
            root.left = insertHelper(root.left, account);
            //root.setLeft(insertHelper(root.left, account));   
        }
        else 
        {
            root.right = insertHelper(root.right, account);      
        }
        return root;
    }

    public String display()
    {
        return displayHelper(root);
    }
    private String displayHelper(Account root)
    {
        if(root != null)
        {
            displayHelper(root.left);
            displayHelper(root.right);
            return root.getName();
        }
        else
        {
            return null;
        }
    }
     
    public Account search(String name)
    {
        return searchHelper(root, name);
    }
    private Account searchHelper(Account root, String name)
    {
        if (root == null)
        {
            return null;
        }
        else if(root.getName().equals(name))
        {
            return root;
        }
        else 
        {
            if(encoding.encode(root.getName()).compareTo(encoding.encode(name))>0)
            {
                return searchHelper(root.left, name);
            }
            else if(encoding.encode(root.getName()).compareTo(encoding.encode(name)) <0)
            {
                return searchHelper(root.right, name);
            }
            else
            {
                return null;
            }
        }
    }
    
    public void delete(String name)
    {
        deleteHelper(name);
    }

    public void deleteHelper( String name)
    {
        Account replacementNode = null;
        Account root = null;
        Account accountToBeRemoved = search(name);

        if (accountToBeRemoved.getLeft() == null && accountToBeRemoved.getRight() == null )
        {
            accountToBeRemoved = null;
        }
        else if (accountToBeRemoved.getLeft() != null && accountToBeRemoved.getRight() == null)
        {
            Account leftNode = accountToBeRemoved.getLeft();
            accountToBeRemoved.left = null;
            accountToBeRemoved = leftNode;
        }
        else if(accountToBeRemoved.getLeft() == null && accountToBeRemoved.getRight() != null)
        {
            Account rightNode = accountToBeRemoved.getRight();
            accountToBeRemoved.right = null;
            accountToBeRemoved = rightNode;  
        }
        else 
        {
            root = accountToBeRemoved.getRight();
            while(root.getLeft() != null)
            {
                replacementNode = root.getLeft();
            }
            accountToBeRemoved = replacementNode;
            replacementNode = null;
        }    
    }
}
    


