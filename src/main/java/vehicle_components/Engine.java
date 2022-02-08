package vehicle_components;

public class Engine {

    private String type;
    private String brand;

    public Engine(String type, String brand){
        this.type = type;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

}
