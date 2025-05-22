package may17;

public class Salary {
    public static void main(String[] args) {
        Salary obj1 = new Salary();
        obj1.salary(100000);
        obj1.salary(100000, 2000000);
    }
    public void salary (int BasicSalary)
    {
        System.out.println(BasicSalary);
    }
    public void salary (int BasicSalary, int GrossSalary)
    {
      System.out.println("Total Salary: "+(BasicSalary+GrossSalary));
    }

}



