package may13;

public class AnimalMain {

    public static void main(String[] args) {

        Animal dog=new Animal();
        dog.color = "Dog is Black";
        dog.weight=25.0f;
        dog.height=5;
        System.out.println("\n##Animal Details");
        dog.animalDetails();
        dog.eat();
        dog.sleep();
        dog.run();
        dog.walk();

        Animal cat=new Animal();
        cat.color="Cat is Grey";
        cat.weight=15.0f;
        cat.height=6;
        System.out.println("\n##Animal Details");
        cat.animalDetails();
        cat.eat();
        cat.sleep();
        cat.run();
        cat.walk();

    }
}
