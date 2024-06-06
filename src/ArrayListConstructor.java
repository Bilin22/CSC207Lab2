import java.util.ArrayList;
import java.util.Collection;


public class ArrayListConstructor {
    /* Construct an empty ArrayList and return it */
    public ArrayList<Object> constructEmptyArrayList() {
        return new ArrayList<>(10);
    }



public ArrayList<String> createAnArrayListWithTwoElements() {
    /*
     * Create an ArrayList which contain String elements.
     *  Add two String elements to the ArrayList. "Jack" and "Daniel"
     *  Return the ArrayList
     */
    ArrayList<String> list = new ArrayList<>();
    list.add("Jack");
    list.add("Daniel");
    return list;
}

public ArrayList<String> createACopyOfAnArrayList(Collection<String> toCopy) {
    /*
     * Make a copy of the parameter "toCopy" and return it
     * Hint: Use the constructor provided above
     */
    return new ArrayList<>(toCopy);
}

public ArrayList<Integer> createAnArrayListWithCapacity(int capacity) {
    /*
     * Construct an ArrayList with an initial capacity specified by parameter capacity
     * The ArrayList should only be able to contain Integers
     */
    return new ArrayList<Integer>(capacity);
}

public ArrayList removeTheFirstElementOfAnArrayList(ArrayList input) {
    /* TODO: Remove the first element (index 0) of the ArrayList input and return it. */
    if (!input.isEmpty()){
        input.remove(0);
    }
    return input;

}
}
