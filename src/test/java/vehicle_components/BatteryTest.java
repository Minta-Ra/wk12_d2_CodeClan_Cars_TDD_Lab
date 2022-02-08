package vehicle_components;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BatteryTest {

    Battery battery;

    @Before
    public void before(){
        battery = new Battery("Lithium Ion (Li-Ion)", "Panasonic");
    }

    @Test
    public void hasType(){
        assertEquals("Lithium Ion (Li-Ion)", battery.getType());
    }

    @Test
    public void hasBrand(){
        assertEquals("Panasonic", battery.getBrand());
    }
}
