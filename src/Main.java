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
    User user1 = new User("Hamza", "sexy man");
    User user2 = new User("jenna", "sexy women");
    User user3 = new User("faeez", "poo poo head");

    BST1.insert(user1);
    BST1.insert(user2);
    BST1.insert(user3);

    
    BST1.display();
    System.out.println(BST1.search("Hamza").description);
    //BST1.delete("Hamza");
    //System.out.println(user1.code);



}
}

