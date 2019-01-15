import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Bumper Cars", 6);
    }

    @Test
    public void canGetAttractionName(){
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(6, dodgems.getRating());
    }
}