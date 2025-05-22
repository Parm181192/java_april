package may17;

public class Computer {

    int capacity;
    int brand;
    public Computer()
    {
        System.out.println("Helo world");
    }
    public Computer(String brand)
    {   this();
        System.out.println("Hello Pragra");
    }
    public Computer(int capacity)
    {   this("brand");
        System.out.println("Hello Students");
    }
}
