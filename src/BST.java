package src;
public class BST 
{
    User root;
    public void insert(User user)
    {
        root = insertHelper(root, user);
    }
    private User insertHelper(User root, User user)
    {
        if(root == null)
        {
            root = user;
            return root;
        }
        else if(encoding.encode(user.getName()).compareTo(encoding.encode(root.getName())) < 0)
        {
            root.left = insertHelper(root.left, user);
            //root.setLeft(insertHelper(root.left, user));
            
        }
        else 
        {
            root.right = insertHelper(root.right, user);
            //root.setRight(insertHelper(root.getRight(), user));       
        }
        return root;
    }

    public void display()
    {
        displayHelper(root);
    }
    private void displayHelper(User root)
    {
        if(root != null)
        {
            displayHelper(root.getLeft());
            System.out.println(root.getName());
            displayHelper(root.getRight());

        }
    }
     
    public User search(String name)
    {
        return searchHelper(root, name);
    }
    private User searchHelper(User root, String name)
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
    */
    public void delete(String name)
    {
        deleteHelper(root, name);
    }

    public User deleteHelper(User root, String name)
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
    private User predecessor(User root2) {
        root = root.right;
        while(root.left != null)
        {
            root = root.left;
        }
        return root;
    }
    public User successor(User root)
    {
        root = root.left;
        while(root.right !=null)
        {
            root = root.right;
        }
        return root;
    }
    
}
    


