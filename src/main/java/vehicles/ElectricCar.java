package vehicles;
import vehicle_components.Battery;
import vehicle_components.Tyres;

public class ElectricCar extends Vehicle {

    private Battery battery;

    public ElectricCar(int price, String colour, String make, Tyres tyres, Battery battery){
        super(price, colour, make, tyres);
        this.battery = battery;
    }

    public Battery getBattery() {
        return battery;
    }
}
