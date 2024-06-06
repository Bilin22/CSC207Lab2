import java.util.ArrayList;
import java.util.HashSet;


public class HashSetTutorial {

    /**
     * TODO: Define a static method createIntegerHashSetWithArrayList that can create a
     * HashSet containing the elements of arraylist
     *
     * @param arrayList an ArrayList contain only Integers
     * @return A HashSet containing the elements of arraylist
     */
    public static HashSet<Integer> createIntegerHashSetWithArrayList(ArrayList<Integer> arrayList){
        return new HashSet<>(arrayList);
    }

    /**
     * TODO: Define a static method clearHashSet that can clear a hashSet.
     * (i.e. No element will be left in the set.)
     * @param hashSet The HashSet to be cleared.
     */
    public static void clearHashSet(HashSet<Integer> hashSet){
        hashSet.clear();
    }

    public static void main(String[] args) {

        // here is an ArrayList that contain some student numbers.
        ArrayList<Integer> studentNumberArrayList = new ArrayList<>();
        studentNumberArrayList.add(10001);
        studentNumberArrayList.add(10002);
        studentNumberArrayList.add(10002);
        studentNumberArrayList.add(10003);
        studentNumberArrayList.add(10003);
        studentNumberArrayList.add(10004);

        // TODO: Create a HashSet of the student numbers using createIntegerHashSetWithArrayList method.
        HashSet<Integer> studentNumberHashSet = createIntegerHashSetWithArrayList(studentNumberArrayList);
        System.out.println(studentNumberHashSet);

        // TODO: Clear the HashSet studentNumberSet using clearHashSet method.
        clearHashSet(studentNumberHashSet);

    }
}
