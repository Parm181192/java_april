package may17;

import org.w3c.dom.ls.LSOutput;

import java.io.FilterOutputStream;

public class Name {
    public static void main(String[] args) {
        Name obj1 = new Name();
        obj1.name("Parminder");
        obj1.name("Parminder ", "Kaur");
        obj1.name("Parminder ", "Kaur ", "Romana");
    }
    public void name (String firstName)
    {
        System.out.println(firstName);
    }
    public void name (String firstName, String middleName)
    {
        System.out.println(firstName+middleName);
    }
    public void name (String firstName, String middleName, String lastName)
    {
        System.out.println(firstName+ middleName+ lastName);
    }
}



