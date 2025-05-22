package may17;

public class Person {
    String name;
    int age;
    String address;

    Person() {
        System.out.println("Default Constructor");
    }

     Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
         System.out.println(name+age);
    }

    Person(String name, int age, String address) {
        this(name,age);
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println(name+age+address);
    }


    }




