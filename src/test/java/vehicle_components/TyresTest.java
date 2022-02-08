package vehicle_components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres("GoodYear", 15);
    }

    @Test
    public void hasMake(){
        assertEquals("GoodYear", tyres.getMake());
    }

    @Test
    public void hasSize(){
        assertEquals(15, tyres.getSize());
    }
}
