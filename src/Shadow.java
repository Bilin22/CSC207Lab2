public class Shadow {
    private int myIntVar = 0;

    public void magicalShadowMethod() {
        int myIntVar = 5;
        // TODO: where code should be inserted to create output 5 0
        System.out.println(myIntVar);
        System.out.println(this.myIntVar);
    }

    public static void main(String[] args){
        new Shadow().magicalShadowMethod();
    }
}
