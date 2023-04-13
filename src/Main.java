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
    BST BST1 = new BST();
    Account account1 = new Account("hamza","help me");

    BST1.insert(account1);


    BST1.display();
    //System.out.println(BST1.search("hamza").getDescription());
    //BST1.delete("Hamza");
    //System.out.println(user1.code);
}
}

