public class HandBag extends Bag{
    public HandBag(String color, int capacity){
        super(color, capacity);

    }

    @Override
    public void enhance(){
        int newCapacity = getCapacity() + 1;
        setCapacity(newCapacity);

    }
}
