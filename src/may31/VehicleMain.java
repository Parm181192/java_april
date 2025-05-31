package may31;

public class VehicleMain {
    public static void main(String[] args) {
        Suzuki s1 = new Suzuki();
        String brand1=s1.brand;
        String seatingCapacity2=s1.seatingCapacity;
        s1.accelerate();
        s1.stop();
        s1.brake();
    }
}
