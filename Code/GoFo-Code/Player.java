package gofo;

public class Player {
    private String name;
    private String email;
    private String password;
    private String address;
    private String paymentMethod;

    public Player()
    {
      name = " ";
      email = " ";
      password = " ";
      address = " ";
      paymentMethod = " ";

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

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void BookPlayground(Playground newPlayground, String time)
    {
        
       newPlayground.setTime(time);

    }

    public void viewPlayground(Playground myPlayground)
    {
       System.out.println("You're playground information");
       System.out.println("Name: " + myPlayground.getName());
       System.out.println("Location: " + myPlayground.getLocation());
       System.out.println("size: " + myPlayground.getSize());
       System.out.println("Time: " + myPlayground.getTime());
    }

}