package may17;

public class Car {

    String carName;
    String brand;
    String engineType;
    String color;
    int horsePower;

    public Car() {
    }

    public Car(String carName)
    {
        this.carName=carName;
    }
    public Car(String carName,String brand)
    {
        this.carName=carName;
        this.brand=brand;
    }
    public Car(String carName,String brand,String engineType)
    {
        this.carName=carName;
        this.brand=brand;
        this.engineType=engineType;
    }
    public Car(String carName,String brand,String engineType,String color)
    {
        this.carName=carName;
        this.brand=brand;
        this.engineType=engineType;
        this.color=color;
    }
    public Car(String carName,String brand,String engineType,String color,int horsePower)
    {
        this.carName=carName;
        this.brand=brand;
        this.engineType=engineType;
        this.color=color;
        this.horsePower=horsePower;
    }
    public void  display()
    {
        System.out.println(carName);
        System.out.println(brand);
        System.out.println(engineType);
        System.out.println(color);
        System.out.println(horsePower);
    }

}
