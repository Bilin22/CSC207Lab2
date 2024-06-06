import java.util.*;

public class Collection {
    public static void main(String[] args) {

        // Declare and initialize an ArrayList of Strings:
        ArrayList<String> csc207team = new ArrayList<String>();

        csc207team.add("Juanita");
        csc207team.add("Amelie");
        csc207team.add("Abhinav");
        csc207team.add("Menghan");

        // ArrayList has a toString that prints the list nicely.
        System.out.println(csc207team);

        // This isn't permitted, because we specified the elements would
        // be of type String:
        // csc207team.add(5);

        // We don't need to typecast. The compiler knows that get will return
        // a String, since this is an ArrayList of Strings.
        csc207team.get(0).charAt(0);

        // Some other useful methods. ArrayList has many more: check the
        // documentation!
        System.out.println(csc207team.size());
        System.out.println("Is alex in csc207team? " +
                csc207team.contains("alex"));

        // We can have an ArrayList of any valid Java object type, i.e.,
        // any built-in or user-defined object. But no primitives!
        // ArrayList<int> wontWork = new ArrayList<int>();

        // But we can get primitives into an ArrayList by using a wrapper
        // class.
        List<Integer> intList = new ArrayList<Integer>();

        // And we can use autoboxing to avoid having to construct instances
        // of the wrapper class. So rather than say:
        intList.add(new Integer(42));
        // ... we can say just:
        intList.add(42);
        System.out.println(intList);

        // We can also automatically unbox.  To get an Integer object from
        // the ArrayList, and get an int from it, we can just say:
        int x = intList.get(0);
        System.out.println(x);



        // Declare a TreeSet of Strings, and try to add some elements.
        TreeSet<String> s = new TreeSet<String>();
            s.add("hello");
            s.add("silly");
            // We can look at the return value of add to see if the operation
            // succeeded.
            System.out.println(s.add("goodbye!"));
            // We won't be able to add this String a second or third time.
            System.out.println(s.add("silly"));
            System.out.println(s.add("silly"));

            // TreeSet has a toString that prints the set nicely.
            // The elements of the set could come out in any order.
            System.out.println(s);

            // TreeSet implements the Iterable interface, which guarantees that
            // it provides a hasNext and a next method. Here we use it to iterate
            // over our set and assemble a single String with all the words.
            String allWords = "";
            Iterator<String> it = s.iterator();
            while (it.hasNext()) {
                allWords += it.next();
            }
            System.out.println(allWords);

            // Because Treeset implements Iterable, we can instead use an
            // enhanced for-loop.  Much more concise!
            allWords = "";
            for(String word: s) {
                allWords += word;
            }
            System.out.println(allWords);




        // Declare and initialize a Map from Strings to Integers.
        // Notice that the generic type HashMap requires two arguments:
        // one for the type of the keys, and one for the type of the values.
        Map<String, Integer> myMap = new HashMap<String, Integer>();

        myMap.put("csc", new Integer(207));
        // We can use autoboxing to get an Integer value into the HashMap.
        myMap.put("bio", 120);
        myMap.put("his", 150);
        myMap.put("ant", 100);
        System.out.println(myMap.get("csc"));

        // "mat" is not a key, so this returns null.
        System.out.println(myMap.get("mat"));

        // HashMap has many other methods -- see the documentation for
        // details.
        }
    }

