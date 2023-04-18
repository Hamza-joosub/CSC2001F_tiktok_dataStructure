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

    public void display()
    {
         displayHelper(root);
    }
    private void displayHelper(Account root)
    {
        if(root != null)
        {
            displayHelper(root.left);
            System.out.println(root.getName());
            displayHelper(root.right);
            
        }
        else
        {
            
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
        
        deleteHelper(search(name),root);
    }

    public Account deleteHelper(Account d,Account root)
    {
        if(root ==null)
        {
            return null;
        }
        else
        {
            if(encoding.encode(d.getName()).compareTo(encoding.encode(root.getName())) < 0)
            {
                root.left = deleteHelper (d, root.left);
            }
            else if(encoding.encode(d.getName()).compareTo(encoding.encode(root.getName())) > 0)
            {
                root.right = deleteHelper (d, root.right);
            }
            else if (root.left != null && root.right != null ) 
            {
                root = getMin(root.right);
                root.right = deleteMin(root.right); 
            }
            else if (root.left != null && root.right == null)
            {
                root = root.left;
            }
            else if(root.left == null && root.right != null)
            {
                root = root.right;
            }
            else
            {
                root = null;
            }
            return root;
        }  
        
        























    }
    public Account getMin(Account node)
    {
        if (node != null)
        {
            while(node.left != null)
            {
                node = node.left;
            }
        }
        return node;
    }

    public Account deleteMin(Account node)
    {
        if (node == null)
        {
            return null;
        }
        else if (node.left !=null)
        {
            node.left = deleteMin(node.left);
            return node;
        }
        else
        {
            return node.right;
        }
    }
}
    


