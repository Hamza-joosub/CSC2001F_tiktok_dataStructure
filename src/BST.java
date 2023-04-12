package src;
public class BST 
{
    User root;
    int code = 1;
    public void insert(User user)
    {
        root = insertHelper(root, user);
    }
    private User insertHelper(User root, User user)
    {
        user.setCode(code);
        code = code+1;

        if(root == null)
        {
            root = user;
            return root;
        }
        else if(code < root.getCode())
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
    /* 
    public boolean search(String name)
    {
        return searchHelper(root, data);
    }
    private boolean searchHelper(Node root, int data)
    {
        if (root == null)
        {
            return false;
        }
        else if(root.data == data)
        {
            return true;
        }
        else if(root.data > data)
        {
            return searchHelper(root.left, data);
        }
        else if(root.data < data)
        {
            return searchHelper(root.right, data);
        }
        else 
        {
            return false;
        }
        }

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
    


