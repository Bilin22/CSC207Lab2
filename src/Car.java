public class Car {
    private String brandName;
    private int capacity;
//    constructor
    public Car(String brandName, int capacity){
        this.brandName = brandName;
        this.capacity = capacity;
    }
//    getter & setter
    public String getBrandName(){
        return brandName;
    }
    public void setBrandName(String newBrandName){
        brandName = newBrandName;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapcity(int newCapacity){
        capacity = newCapacity;
    }
}
