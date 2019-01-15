import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Suicide Ride", 10);
    }

    @Test
    public void canGetRollercoasterName(){
        assertEquals("Suicide Ride", rollercoaster.getName());
    }

    @Test
    public void visitorIsAllowedToRide(){
        Visitor visitor = new Visitor(14, 150, 20);
        assertEquals(true, rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void visitorIsTooShortToRide(){
        Visitor visitor = new Visitor(14, 144, 20);
        assertEquals(false, rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void visitorIsTooYoungToRide(){
        Visitor visitor = new Visitor(11, 146, 20);
        assertEquals(false, rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void visitorIsTooYoungAndTooShortToRide(){
        Visitor visitor = new Visitor(11, 140, 20);
        assertEquals(false, rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void canGetRating(){
        assertEquals(10, rollercoaster.getRating());
    }
}
