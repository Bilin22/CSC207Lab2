public class Adder {
    private static int a = 0;
    private int b = 0;

    public Adder() {
        a++;
        b++;
    }

    public static void main(String[] args) {
        Adder adder1 = new Adder();
        Adder adder2 = new Adder();
        Adder adder3 = new Adder();
    }
}
