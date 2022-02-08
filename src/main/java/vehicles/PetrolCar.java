package vehicles;
import vehicle_components.Engine;
import vehicle_components.Tyres;

public class PetrolCar extends Vehicle {

    private Engine engine;

    public PetrolCar(int price, String colour, String make, Tyres tyres, Engine engine){
        super(price, colour, make, tyres);
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

}
