package vehicles;
import vehicle_components.Battery;
import vehicle_components.Engine;
import vehicle_components.Tyres;

public class HybridCar extends Vehicle{

    private Engine engine;
    private Battery battery;

    public HybridCar(int price, String colour, String make, Tyres tyres, Engine engine, Battery battery){
        super(price, colour, make, tyres);
        this.engine = engine;
        this.battery = battery;
    }

    public Engine getEngine() {
        return engine;
    }

    public Battery getBattery() {
        return battery;
    }
}
