package src;
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
            //root.setLeft(insertHelper(root.left, user));
            
        }
        else 
        {
            root.right = insertHelper(root.right, account);
            //root.setRight(insertHelper(root.getRight(), user));       
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
            displayHelper(root.getLeft());
            System.out.println(root.getName());
            displayHelper(root.getRight());
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
/*
    public void remove(int data)
    {
        if(search(data) == true)
        {
            removeHelper(root, data);
        }
        else
        {
            System.out.println("cant find data");
        }
    }
    
    public void delete(String name)
    {
        deleteHelper(root, name);
    }

    public Account deleteHelper(Account root, String name)
    {
        if(root.equals(null))
        {
            return root;
        }
        else if(encoding.encode(name).compareTo(encoding.encode(root.getName()))<0)
        {
            root.left = deleteHelper(root.getLeft(), name);
        }
        else if(encoding.encode(name).compareTo(encoding.encode(root.getName()))>0)
        {
            root.right = deleteHelper(root.getRight(), name);
        }
        else 
        {
            if(root.left == null && root.right == null)
            {
                root = null;
            }
            else if(root.right != null)
            {
                root = successor(root);
                root.right = deleteHelper(root.right, root.name);

            }
            else {
                root = predecessor(root);
                root.left = deleteHelper(root.left, root.name);
            }
        }
        return root;
    }
    public Account predecessor(Account root2) {
        root = root.right;
        while(root.left != null)
        {
            root = root.left;
        }
        return root;
    }
    public Account successor(Account root)
    {
        root = root.left;
        while(root.right !=null)
        {
            root = root.right;
        }
        return root;
    }
    */
    
}
    


