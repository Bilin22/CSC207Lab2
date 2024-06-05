import java.util.Arrays;
import java.util.Comparator;

public class Review implements Comparable<Review> {
    // === Class Variables ===

    // The name of the item that this Review is about.
    String item;
    // The numeric rating, between 0 and 100, associated with this Review.
    private int rating;
    // The written component of this review.
    private String text;
    // The number of likes that this review has received.
    private int likes;

    public Review(String item, int rating, String text) {
        this.item = item;
        this.rating = rating;
        this.text = text;
        this.likes = 0;
    }

    public String toString() {
        return this.item + " (" + this.rating + "): " +
                this.text + "; likes = " + this.likes;
    }
    /**
     * Records a like for this Review.
     */
    public void like() {
        this.likes += 1;
    }
    /**
     * Compares this object with the specified object for order.
     *
     * Returns a negative integer, zero, or a positive integer as this
     * object is less than, equal to, or greater than the specified object.
     *
     * @param other the object to be compared.
     * @return a negative integer, zero, or a positive integer as this
     * object is less than, equal to, or greater than the specified object.
     */
    @Override
    public int compareTo(Review other) {
        if (this.rating < other.rating) {
            return -1;
        } else if (this.rating > other.rating) {
            return 1;
        } else {
            return 0;
        }



        }
    public static void main(String[] args) {


        Review r1 = new Review("Emoji Movie", 10,
                "Cinematic malware");
        Review r2 = new Review("Dunkirk", 95,
                "Gifted ensemble cast and masterful direction");
        Review r3 = new Review("Spider Man: Homecoming", 95,
                "A fun adventure");
        Review r4 = new Review("My Neighbour Totoro", 99,
                "A work of art");
        Review r5 = new Review("Despicable Me3", 60,
                "Zany but scattershot humour");

        System.out.println(r1.compareTo(r2)); // -1
        System.out.println(r2.compareTo(r1)); // 1
        System.out.println(r2.compareTo(r3)); // 0

        Review[] badFruit = {r1, r2, r3, r4, r5};
        Arrays.sort(badFruit);
        for (int i = 0; i < badFruit.length; i++) {
            System.out.println(badFruit[i]);
        }
    }
}