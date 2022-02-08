package vehicles;
import org.junit.Before;
import org.junit.Test;
import vehicle_components.Engine;
import vehicle_components.Tyres;
import static org.junit.Assert.*;

public class PetrolCarTest {

    PetrolCar petrolCar;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        engine = new Engine("Petrol", "Toyota");
        tyres = new Tyres("GoodYear", 15);
        petrolCar = new PetrolCar(7000, "Green", "Toyota", tyres,  engine);
    }

    @Test
    public void hasPrice(){
        assertEquals(7000, petrolCar.getPrice());
    }

    @Test
    public void hasTyres(){
        assertEquals("GoodYear", petrolCar.getTyres().getMake());
    }

    @Test
    public void hasEngine(){
        assertNotNull(petrolCar.getEngine());
    }

    @Test
    public void hasColour(){
        assertEquals("Green", petrolCar.getColour());
    }

    @Test
    public void hasMake(){
        assertEquals("Toyota", petrolCar.getMake());
    }

}
