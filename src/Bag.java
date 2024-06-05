
public abstract class Bag {
    private String color;
    private int capacity;
    private int numberOfContents;
    private String[] contents;

    /**
     *
     * @param color: the color of this bag
     * @param capacity: the capacity of this bag
     */
    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.numberOfContents = 0;
//        initialize the array with length equals capacity
        this.contents = new String[capacity];
    }
    public String getColor(){
        return color;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getNumberOfContents(){
        return numberOfContents;
    }
    // Helper method to access the private contents array
    private String[] getContents() {
        return contents;
    }

    /**
     *
     * @param Color: the color we want to set.
     */
    public void setColor(String Color){
        color = Color;
    }

    protected void setCapacity(int newCapacity) {
        String[] newContents = new String[newCapacity];
        System.arraycopy(getContents(), 0, newContents, 0, getNumberOfContents());
        this.capacity = newCapacity;
        this.contents = newContents;
    }

    /**
     *
     * @param item: item to be added
     * @return item if the bag is full, otherwise return null
     */

    public String addItem(String item){
        if (numberOfContents == capacity){
            return item;
        } else {
            contents[numberOfContents] = item;
            numberOfContents++;
            return null;
        }
    }

    /**
     *
     * @return null if the bag is empty, return and pop the last content otherwise.
     */
    public String popItem(){
        if (numberOfContents == 0){
            return null;
        } else {
            String lastItem = contents[numberOfContents- 1];
            contents[numberOfContents - 1] = null;
            numberOfContents--;
            return lastItem;
        }
    }

// abstract method with no body and no argument.
    public abstract void enhance();


}




