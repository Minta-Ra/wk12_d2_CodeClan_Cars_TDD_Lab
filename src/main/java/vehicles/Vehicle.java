package vehicles;
import vehicle_components.Tyres;

public abstract class Vehicle {

    private int price;
    private String colour;
    private String make;
    private Tyres tyres;

    public Vehicle(int price, String colour, String make, Tyres tyres){
        this.price = price;
        this.colour = colour;
        this.make = make;
        this.tyres = tyres;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public String getMake() {
        return make;
    }

    public Tyres getTyres() {
        return tyres;
    }
}
