package may17;

public class Main {

    public static void main(String[] args) {
        Car Car1=new Car();
        Car Car11=new Car("Civic");
        Car Car12=new Car("Civic","Honda");
        Car Car13=new Car("Civic","Honda","Petrol");
        Car Car14=new Car("Civic","Honda","Petrol","Black");
        Car Car15=new Car("Civic","Honda","Petrol","Black",720);
        Car15.display();

        Car Car2=new Car();
        Car Car21=new Car("Mustang");
        Car Car22=new Car("Mustang","Ford");
        Car Car23=new Car("Mustang","Ford","Auto");
        Car Car24=new Car("Mustang","Ford","Auto","Black");
        Car Car25=new Car("Mustang","Ford","Auto","Black",720);

    }
}
