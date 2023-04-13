package src;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class getData 
{
    
    public static ArrayList<User> fetch()
    {
        
        ArrayList<User> users = new ArrayList<User>(1);
    try {
        Scanner sc = new Scanner(new File("C:\\Users\\mojoo\\Downloads\\names.txt"));
        int count = 1;
        while (sc.hasNextLine())
        {
            String name = sc.nextLine();
            //users.add(new User(name,));
            count = count + 1;
        }
    } 
    catch (Exception e) {
        System.out.println(e);
    }
    return users;
}
}