package vehicles;
import org.junit.Before;
import org.junit.Test;
import vehicle_components.Battery;
import vehicle_components.Engine;
import vehicle_components.Tyres;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;
    Battery battery;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        battery = new Battery("Lithium Ion (Li-Ion)", "Panasonic");
        engine = new Engine("Petrol", "Toyota");
        tyres = new Tyres("GoodYear", 15);
        hybridCar = new HybridCar(20000, "Blue", "Toyota", tyres, engine, battery);
    }

    @Test
    public void hasEngine(){
        assertNotNull(hybridCar.getEngine());
    }

    @Test
    public void hasTyers(){
        assertNotNull(hybridCar.getTyres());
    }

    @Test
    public void hasBattery(){
        assertNotNull(hybridCar.getBattery());
    }

    @Test
    public void hasColour(){
        assertEquals("Blue", hybridCar.getColour());
    }


}
