package gofo;

public class Playground {
    private String name;
    private String location;
    private double size;
    private String time;

    public Playground()
    {
       name = "GOFO";
       location = "cairo";
       size = 900;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }
}
