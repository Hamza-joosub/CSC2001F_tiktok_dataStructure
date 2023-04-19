package src;
import src.Account; 
import src.Actions; 
import src.BST;
import src.encoding;
import src.post;
import java.math.BigInteger;
/**
 * The BST class is a binary search tree implementation that allows for insertion, deletion, and
 * searching of Account objects based on their name.
 */
public class BST 
{
    Account root;
    int top = 0;
        int second = 0;
        int third = 0;
        int searchCount;
        Account topSearched, secondSearched, thirdSearched;
        
    String result = "Top Searched:" + "\n";
    // This code is implementing the insertion of an Account object into a binary search tree. The
    // `insert` method takes an `Account` object as a parameter and calls the `insertHelper` method
    // with the root of the tree and the `Account` object. The `insertHelper` method recursively
    // traverses the tree to find the correct position to insert the `Account` object based on the
    // lexicographic order of the account names. If the root is null, the `Account` object is inserted
    // as the root. If the name of the `Account` object is less than the name of the root, the
    // `insertHelper` method is called with the left child of the root and the `Account` object. If the
    // name of the `Account` object is greater than or equal to the name of the root, the
    // `insertHelper` method is called with the right child of the root and the `Account` object. The
    // method returns the root of the tree after the insertion is complete.
    public void insert(src.Account account)
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
               
        }
        else 
        {
            root.right = insertHelper(root.right, account);      
        }
        return root;
    }

    // The `display()` method is used to print out the names of all the `Account` objects in the binary
    // search tree in lexicographic order. It calls the `displayHelper()` method with the root of the
    // tree as a parameter. The `displayHelper()` method recursively traverses the tree in-order (left
    // subtree, root, right subtree) and prints out the name of each `Account` object it encounters. If
    // the root is null, the method does nothing.
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
    













    public void findTopSearchedAccounts()
    {
        findTopSearchedAccountsHelper(root);
    }
    private void findTopSearchedAccountsHelper(Account root)
    {
        
        if(root != null)
        {
            findTopSearchedAccountsHelper(root.left);
            searchCount = root.getSearchCount();
            if(searchCount > top && searchCount> second && searchCount>third)
            {
                top = searchCount;
                topSearched = root;
            }
            findTopSearchedAccountsHelper(root.right);
            
        }
        else
        {
            
        }
    }  

















 // The `search` method takes a `String` parameter `name` and returns an `Account` object with the
 // matching name if it exists in the binary search tree. It calls the `searchHelper` method with the
 // root of the tree and the `name` parameter as arguments. The `searchHelper` method recursively
 // traverses the tree to find the `Account` object with the matching name. If the root is null, it
 // returns null. If the name of the root matches the `name` parameter, it returns the root. If the
 // name of the `Account` object is less than the name of the root, the `searchHelper` method is called
 // with the left child of the root and the `name` parameter. If the name of the `Account` object is
 // greater than the name of the root, the `searchHelper` method is called with the right child of the
 // root and the `name` parameter. If the `Account` object with the matching name is not found, it
 // returns null.
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
    
    // This code is implementing the deletion of an `Account` object from a binary search tree. The
    // `delete` method takes a `String` parameter `name` and calls the `deleteHelper` method with the
    // `Account` object with the matching name and the root of the tree as arguments. The
    // `deleteHelper` method recursively traverses the tree to find the `Account` object with the
    // matching name. If the root is null, it returns null. If the name of the `Account` object is less
    // than the name of the root, the `deleteHelper` method is called with the left child of the root
    // and the `Account` object. If the name of the `Account` object is greater than the name of the
    // root, the `deleteHelper` method is called with the right child of the root and the `Account`
    // object. If the `Account` object with the matching name is found, it is deleted from the tree. If
    // the `Account` object has two children, the `getMin` method is called to find the minimum
    // `Account` object in the right subtree, and that `Account` object is swapped with the `Account`
    // object to be deleted
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
    public String get1st()
    {
        if (topSearched == null)
        {
            return "no top searched account ";
        }
        else
        {
        return "top search is: " + topSearched.getName() + " with " + top + " searches";
        }
    }
    }

    


