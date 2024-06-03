public class Bicycle {
    private String owner;
    public Bicycle(String ownerName) {
        this.owner = ownerName;
    }
    public void changeOwner (String NewOwnerName){
        owner = NewOwnerName;
    }
}
