package src;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
public class ToktTik
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
    String inputString1, inputString2, inputString3, inputString4;
    Scanner inputScanner1, inputScanner2, inputScanner3, inputScanner4;
    int input1 = 0;
    while(input1 != 8)
    {
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
    inputScanner1 = new Scanner(System.in);
    inputString1 = inputScanner1.next();
    input1 = Integer.parseInt(inputString1);

    switch(input1)
    {
        case 1: //find profile description
        {
            System.out.println("Enter Name of Account");
            inputScanner2 = new Scanner(System.in);
            inputString2 = inputScanner2.next();
            try {
                System.out.println(action.ShowDescriptionOfAccount(inputString2));
            } catch (Exception e) {
                System.out.println("account not found");
            }
            continue;
        }
        case 2://list all accounts
        {
            action.listAccounts();
            continue;
        }
        case 3://create and insert account into tree
        {
            System.out.println("Enter Name of Account");
            inputScanner2 = new Scanner(System.in);
            inputString2 = inputScanner2.next();
            System.out.println("Enter Description of Account");
            inputScanner3 = new Scanner(System.in);
            inputString3 = inputScanner3.next();
            try 
            {
                action.createAccount(inputString2, inputString3);
            } catch (Exception e) {
                System.out.println("account credentials invalid");
            }
            continue;
        }

        case 4://remove an account
        {
            System.out.println("Enter Name of Account to be deleted");
            inputScanner2 = new Scanner(System.in);
            inputString2 = inputScanner2.next();
            try {
                action.deleteAccount(inputString2);
            } catch (Exception e) {
                System.out.println("account not found");
            }
            continue;
        }
        case 5://show all posts for given account
        {
            System.out.println("Enter Name of Account to show posts for");
            inputScanner2 = new Scanner(System.in);
            inputString2 = inputScanner2.next();
            try {
                System.out.println(action.ShowPosts(inputString2));
            } catch (Exception e) {
                System.out.println("account not found");
            }
            continue;
        }
        case 6://create and add post to account
        {
            System.out.println("Enter Name of Account");
            inputScanner2 = new Scanner(System.in);
            inputString2 = inputScanner2.next();

            System.out.println("Enter Post title");
            inputScanner3 = new Scanner(System.in);
            inputString3 = inputScanner3.next();

            System.out.println("Enter Post name");
            inputScanner4 = new Scanner(System.in);
            inputString4 = inputScanner4.next();
            try {
                action.addPost(inputString2, inputString3, inputString4, 0);
            } catch (Exception e) {
                System.out.println("invalid post credentials");
            }
            
            continue;
        }
        case 7:
        {
            /* 
            String name;
            try 
            {
                Scanner scanner = new Scanner(new File("/Users/hamza/Documents/Progamming/Univeristy/Java/CSC2001F_tiktok_dataStructure/src/names.txt"));
                while(scanner.hasNext())
                {
                    name = scanner.nextLine();
                    action.createAccount(name, "");
                }
            continue;
            } 
            catch (FileNotFoundException e) 
            {
            e.printStackTrace();
            }
            */

            String line,command,name, description,title,VideoName,likesString;
            int likes;
            try
            {
                Scanner scanner2 = new Scanner(new File("/Users/hamza/Documents/Progamming/Univeristy/Java/CSC2001F_tiktok_dataStructure/src/dataset.txt"));
                Scanner scanner3;
                while(scanner2.hasNext())
                {
                    line = scanner2.nextLine();
                    scanner3 = new Scanner(line).useDelimiter(" ");
                    command = scanner3.next();
                    if(command.equals("Create"))
                    {
                        name = scanner3.next();
                        scanner3.useDelimiter("\\z");
                        description = scanner3.next();
                        action.createAccount(name, description);
                    }
                    else
                    {
                        name = scanner3.next();
                        title = scanner3.next();
                        likesString = scanner3.next();
                        likes = Integer.parseInt(likesString);
                        scanner3.useDelimiter("\\z");
                        VideoName = scanner3.next();
                        action.addPost(name, title, VideoName, likes);
                    }
                }
            }
            catch (FileNotFoundException e) 
            {
            e.printStackTrace();
            }





            
        }
        case 8://exit the application
        {
            break;
        }
        

    }
    }
}
}

