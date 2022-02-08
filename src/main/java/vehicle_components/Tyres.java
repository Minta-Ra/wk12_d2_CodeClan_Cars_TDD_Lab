package vehicle_components;

public class Tyres {

    private String make;
    private int size;

    public Tyres(String make, int size){
        this.make = make;
        this.size = size;
    }

    public String getMake() {
        return make;
    }

    public int getSize() {
        return size;
    }
}
