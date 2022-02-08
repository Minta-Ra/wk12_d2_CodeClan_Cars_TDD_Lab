import org.junit.Before;
import org.junit.Test;
import vehicle_components.Battery;
import vehicle_components.Tyres;
import vehicles.ElectricCar;
import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Battery battery;
    Tyres tyres;
    ElectricCar electricCar;


    @Before
    public void before(){
        customer = new Customer("Anna", 20000);
        battery = new Battery("Lithium Ion (Li-Ion)", "Panasonic");
        tyres = new Tyres("GoodYear", 15);
        electricCar = new ElectricCar(15000, "Green", "XPeng", tyres, battery);
    }

    @Test
    public void hasName(){
        assertEquals("Anna", customer.getName());
    }

    @Test
    public void hasMoney(){
        assertEquals(20000, customer.getMoney(), 0.0);
    }

    @Test
    public void carListStartEmpty(){
        assertEquals(0, customer.getCarCount(), 0.0);
    }

    @Test
    public void canAddCarToList(){
        customer.addCar(electricCar);
        assertEquals(1, customer.getCarCount(), 0.0);
    }

    @Test
    public void canBuyCar(){
        customer.buyCar(electricCar);
        assertEquals(1, customer.getCarCount(), 0.0);
        assertEquals(5000, customer.getMoney(), 0.0);
    }

    @Test
    public void cannotBuyCar(){
        customer.buyCar(electricCar);
        customer.buyCar(electricCar);
        assertEquals(1, customer.getCarCount(), 0.0);
        assertEquals(5000, customer.getMoney(), 0.0);
    }

}
