import org.junit.Before;
import org.junit.Test;
import vehicle_components.Battery;
import vehicle_components.Engine;
import vehicle_components.Tyres;
import vehicles.HybridCar;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    HybridCar hybridCar;
    Battery battery;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        dealership = new Dealership("CodeClan Cars");
        battery = new Battery("Lithium Ion (Li-Ion)", "Panasonic");
        engine = new Engine("Petrol", "Toyota");
        tyres = new Tyres("GoodYear", 15);
        hybridCar = new HybridCar(20000, "Blue", "Toyota", tyres, engine, battery);
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan Cars", dealership.getName());
    }

    @Test
    public void carStockStartEmpty(){
        assertEquals(0, dealership.getCarStockCount());
    }

    @Test
    public void canAddCarToList(){
        dealership.addCar(hybridCar);
        assertEquals(1, dealership.getCarStockCount());
    }

    @Test
    public void tillStartEmpty(){
        assertEquals(0, dealership.getTill(), 0.0);
    }

    @Test
    public void canAddMoneyToTill(){
        dealership.addMoneyToTill(20000);
        assertEquals(20000, dealership.getTill(), 0.0);
    }

}
