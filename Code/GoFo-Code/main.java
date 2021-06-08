package gofo;
import java.util.*;
public class main
{

    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);

        /*Register a playground owner*/
        System.out.println("Register a playground Owner.");
        PlaygroundOwner newPlaygroundOwner = new PlaygroundOwner();
        System.out.print("Owner Name : ");
        String ownerName = input.nextLine();
        System.out.print("Owner email : ");
        String ownerEmail = input.nextLine();
        System.out.print("Owner password : ");
        String ownerPassword = input.nextLine();
        newPlaygroundOwner.register(ownerName,ownerEmail,ownerPassword);
        System.out.println("Welcome, " + ownerName);
        System.out.println("To register your playground, Enter its information");
        Playground playground = new Playground();
        newPlaygroundOwner.registerPlayground(playground);

        /*Register a player owner*/
       System.out.println("Register a player.");
       Player newPlayer = new Player();
       System.out.print("User Name : ");
       String playerName = input.nextLine();
       System.out.print("User email : ");
       String playerEmail = input.nextLine();
       System.out.print("User password : ");
       String playerPassword = input.nextLine();
       System.out.println("Welcome, " + playerName);
       System.out.println("To Book a playground");
       System.out.print("Enter the suitable time for you: ");
       String time = input.nextLine();
       newPlayer.BookPlayground(playground,time);
       newPlayer.viewPlayground(playground);

       
    }
}
