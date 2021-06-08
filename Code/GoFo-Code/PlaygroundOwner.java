package gofo;
import java.util.*;
public class PlaygroundOwner {
    Scanner input = new Scanner(System.in);
    private String name;
    private String email;
    private String password;

    public PlaygroundOwner() {
        name = " ";
        email = " ";
        password = " ";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    
    public void register ( String name , String email , String password )
    {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void registerPlayground(Playground myPlayground)
    {
        
        System.out.print("Name : ");
        String PlaygroundName = input.nextLine();
        myPlayground.setName(PlaygroundName);

        System.out.print("Location: ");
        String PlaygroundLocation = input.nextLine();
        myPlayground.setLocation(PlaygroundLocation);

        System.out.print("Size : ");
        double PlaygroundSize = input.nextDouble();
        myPlayground.setSize(PlaygroundSize);

    }
}
