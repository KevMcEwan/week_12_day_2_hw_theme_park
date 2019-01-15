import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class IceCreamVanTest {

    IceCreamVan iceCreamVan;

    @Before
    public void before(){
        iceCreamVan = new IceCreamVan("Mr Whippy", "Bob Whippy", 4, 8);
    }

    @Test
    public void canGetIceCreamVanName(){
        assertEquals("Mr Whippy", iceCreamVan.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Bob Whippy", iceCreamVan.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(4, iceCreamVan.getParkingSpot());
    }

    @Test
    public void canGetRating(){
        assertEquals(8, iceCreamVan.getRating());
    }
}
