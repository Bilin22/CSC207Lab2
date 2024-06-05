public class SimpleClass {
    private String a;
    public SimpleClass(String input) {
        a = input;
    }
// why this return false
    public static void main(String args[]) {
        SimpleClass a = new SimpleClass("123");
        SimpleClass b = new SimpleClass("123");
        System.out.println(a.equals(b));
        System.out.println(a == b);
    }
}
