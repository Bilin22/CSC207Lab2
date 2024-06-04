import java.util.HashMap;

public class Coordinate {

    private int X;
    private int Y;

    public Coordinate(int x, int y) {
        this.X = x;
        this.Y = y;
    }
    /**
     *  Implement the equals method so that two coordinate objects are the
     * same if their x and y are the same value.
     *
     * @param obj
     * @return true if two objects are the same as the definition, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        // the code goes here
        Coordinate test = (Coordinate) obj;
        return this.X == test.X && this.Y == test.Y;
    }
    public static void main(String[] args) {
        Coordinate test = new Coordinate(0, 0);
        Coordinate test2 = new Coordinate(0, 1);
        boolean result = test.equals(test2);
        System.out.println(result);




    }






}
