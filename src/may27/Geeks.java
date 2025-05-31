package may27;

public class Geeks {

    public static void Geeks1(String s1)
    {
        s1=s1+"forgeeks";
    }
    public static void Geeks2(StringBuilder s2)
    {
        s2.append("forgeeks");
    }
    public static void Geeks3(StringBuffer s3)
    {
        s3.append("forgeeks");
    }

    public static void main(String[] args) {
        String s1 = "Geeks";
        Geeks1(s1);
        System.out.println(s1);
        StringBuilder s2 = new StringBuilder("Geeks");
        Geeks2(s2);
        System.out.println(s2);
        StringBuffer s3 = new StringBuffer("Geeks");
        Geeks3(s3);
        System.out.println(s3);
    }
}

