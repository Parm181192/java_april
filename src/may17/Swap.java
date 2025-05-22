package may17;

public class Swap {

    public void swapValues(int x,int y) {
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        Swap swap=new Swap();
        swap.swapValues(10,20);
    }
}






















