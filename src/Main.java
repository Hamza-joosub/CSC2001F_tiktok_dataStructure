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

    Actions action =  new Actions();
    
    action.createAccount("b", "poopoohead");
    action.createAccount("c", "bighead");
    action.createAccount("d", "bigman");
    action.createAccount("a", "hi");
    action.createAccount("e", "dong");

    System.out.println("before");
    action.listAccounts();

    action.deleteAccount("b");

    System.out.println("");
    System.out.println("after");
    action.listAccounts();
    //System.out.println(action.ShowPosts("hamza"));
    
   // ArrayList<User> users = getData.fetch();
/* 
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
    */
}
}

