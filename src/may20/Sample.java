package may20;

public class Sample {
        {
            System.out.println("Instance block "); //2 , instance is preferred over constructor
        }
        static {
            System.out.println("Inside the static block"); // 1
        }
        Sample(){
            System.out.println("Constructor"); // 3
        }
        public static void show(){
            System.out.println("Static method"); // 4
        }

        public static void main(String[] args) {
            Sample sample = new Sample();
            Sample sample1 = new Sample();
            Sample.show(); // this is calling a static method
        }
}
