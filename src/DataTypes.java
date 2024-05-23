import java.util.List;


public class DataTypes {
    // fix this code so that it passes the test in DataTypesTest.java
    public static long sum(List<Integer> numbers) {

        long s = 0;
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
