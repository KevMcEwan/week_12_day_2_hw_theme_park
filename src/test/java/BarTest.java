import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarTest {

    Bar bar;

    @Before
    public void before(){
        bar = new Bar("Duff Gardens", "Duffman", 9, 5);
    }

    @Test
    public void canGetBarName(){
        assertEquals("Duff Gardens", bar.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Duffman", bar.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(9, bar.getParkingSpot());
    }

    @Test
    public void visitorsUnder18NotAllowed(){
        Visitor visitor = new Visitor(14, 150, 20);
        assertEquals(false, bar.isAllowedTo(visitor));
    }

    @Test
    public void visitors18OrOverAreAllowed(){
        Visitor visitor = new Visitor(18, 175, 50);
        assertEquals(true, bar.isAllowedTo(visitor));
    }

    @Test
    public void canGetRating(){
        assertEquals(5, bar.getRating());
    }
}
