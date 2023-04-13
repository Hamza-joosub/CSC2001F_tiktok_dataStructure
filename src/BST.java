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
        else if(encoding.encode(user.getName()).compareTo(root.getCode()) < 0)
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
            if(root.getCode().compareTo(encoding.encode(name))>0)
            {
                return searchHelper(root.left, name);
            }
            else if(root.getCode().compareTo(encoding.encode(name)) <0)
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
    public Node removeHelper(Node root, int data)
    {
        if(root == null)
        {
            return root;
        }
        else if(data<root.data)
        {
            root.left = removeHelper(root.left, data);
        }
        else if(data>root.data)
        {
            root.right = removeHelper(root.right, data);
        }
        else 
        {
            if(root.left == null && root.right == null)
            {
                root = null;
            }
            else if(root.right != null)
            {
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);

            }
            else {
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }
    private int predecessor(Node root2) {
        root = root.right;
        while(root.left != null)
        {
            root = root.left;
        }
        return root.data;
    }
    public int successor(Node root)
    {
        root = root.left;
        while(root.right !=null)
        {
            root = root.right;
        }
        return root.data;
    }
    */
}
    


