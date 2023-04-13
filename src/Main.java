package src;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main
{
public static void main(String[] args) 
{
    /* 
    ArrayList<User> users = getData.fetch();
    for (int i = 0;i<users.size();i++)
    {
        System.out.println(users.get(i).getCode());
    }
    */
   // ArrayList<User> users = getData.fetch();
    
    Actions action =  new Actions();
    action.createAccount("hamza", "wozers");
    System.out.println(action.ShowDescriptionOfAccount("hamza"));
    System.out.println(action.listAccounts());
    action.addPost("hamza", "me.mov", "your naai", 1000);
    System.out.println(action.ShowPosts("hamza"));
System.out.print("Choose an action from the menu:" + "\n" +
    "1. Find the profile description for a given account"  + "\n" +
    "2. List all accounts"  + "\n" +
    "3. Create an account"  + "\n" +
    "4. Delete an account"  + "\n" +
    "5. Display all posts for a single account"  + "\n" +
    "6. Add a new post for an account"  + "\n" +
    "7. Load a file of actions from disk and process this"  + "\n" +
    "8. Quit"  + "\n" +
    "Enter your choice:");
    
    
}
}

