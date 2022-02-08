package vehicles;
import org.junit.Before;
import org.junit.Test;
import vehicle_components.Battery;
import vehicle_components.Tyres;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ElectricCarTest {

    ElectricCar electricCar;
    Battery battery;
    Tyres tyres;

    @Before
    public void before(){
        battery = new Battery("Lithium Ion (Li-Ion)", "Panasonic");
        tyres = new Tyres("GoodYear", 15);
        electricCar = new ElectricCar(7000, "Green", "XPeng", tyres, battery);
    }

    @Test
    public void hasPrice(){
        assertEquals(7000, electricCar.getPrice());
    }

    @Test
    public void hasBattery(){
        assertNotNull(electricCar.getBattery());
    }

    @Test
    public void hasTyres(){
        assertNotNull(electricCar.getTyres());
    }

}
