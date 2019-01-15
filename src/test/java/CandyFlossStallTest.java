import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall  = new CandyFlossStall ("Diabeetus Fluff", "Wilford Brimley", 7, 4);
    }

    @Test
    public void canGetCandyFlossStallName(){
        assertEquals("Diabeetus Fluff", candyFlossStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Wilford Brimley", candyFlossStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(7, candyFlossStall.getParkingSpot());
    }

    @Test
    public void canGetRating(){
        assertEquals(4, candyFlossStall.getRating());
    }
}