package vehicle_components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine("Petrol", "Toyota");
    }

    @Test
    public void hasType(){
        assertEquals("Petrol", engine.getType());
    }

    @Test
    public void hasBrand(){
        assertEquals("Toyota", engine.getBrand());
    }


}
