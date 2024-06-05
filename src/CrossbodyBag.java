public class CrossbodyBag extends Bag {
    private int numberOfStraps;

    /**
     *
     * @param color: the color of this bag
     * @param capacity: the capacity of this bag
     * @param numberOfStraps: the number of straps this bag has
     */
    public CrossbodyBag(String color, int capacity, int numberOfStraps) {
//        call the constructor of its super class
        super(color, capacity);
        this.numberOfStraps = numberOfStraps;
    }

    /**
     *
     * @return the number of straps of this bag.
     */

    public int getNumberOfStraps(){
        return numberOfStraps;
    }

//    implement the enhance function
    @Override
    public void enhance(){
        int newCapacity = getCapacity() + 2;
        setCapacity(newCapacity);
        
        }






    }
