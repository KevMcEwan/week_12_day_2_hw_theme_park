import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GhostTrainTest {

    GhostTrain ghostTrain;

    @Before
    public void before(){
        ghostTrain = new GhostTrain("Floating Scotsman", 7);
    }

    @Test
    public void canGetGhostTrainName(){
        assertEquals("Floating Scotsman", ghostTrain.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(7, ghostTrain.getRating());
    }

}
