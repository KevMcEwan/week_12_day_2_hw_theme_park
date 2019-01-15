import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark fawltyTowers;

    @Before
    public void before(){
        fawltyTowers = new ThemePark("Fawlty Towers");
    }

    @Test
    public void parkHasName(){
        assertEquals("Fawlty Towers", fawltyTowers.getName());
    }

    @Test
    public void parkStartsWithZeroAttractions(){
        assertEquals(0, fawltyTowers.countAttractions());
    }

    @Test
    public void canAddAttractionToPark(){
        assertEquals(0, fawltyTowers.countAttractions());
        Rollercoaster rollercoaster = new Rollercoaster("Tooth Chipper", 9);
        GhostTrain ghostTrain = new GhostTrain("Floating Scotsman", 8);
        fawltyTowers.addAttraction(rollercoaster);
        fawltyTowers.addAttraction(ghostTrain);
        assertEquals(2, fawltyTowers.countAttractions());
    }

    @Test
    public void canRemoveAttractionFromPark(){
        assertEquals(0, fawltyTowers.countAttractions());
        Rollercoaster rollercoaster = new Rollercoaster("Tooth Chipper", 9);
        GhostTrain ghostTrain = new GhostTrain("Floating Scotsman", 8);
        fawltyTowers.addAttraction(rollercoaster);
        fawltyTowers.addAttraction(ghostTrain);
        assertEquals(2, fawltyTowers.countAttractions());
        fawltyTowers.removeAttraction(rollercoaster);
        assertEquals(1, fawltyTowers.countAttractions());
    }

    @Test
    public void parkStartsWithZeroStalls(){
        assertEquals(0, fawltyTowers.countStalls());
    }

    @Test
    public void canAddStallToPark(){
        assertEquals(0, fawltyTowers.countStalls());
        IceCreamVan iceCreamVan = new IceCreamVan("Mr Whippy", "Bob Whippy", 4, 8);
        fawltyTowers.addStall(iceCreamVan);
        assertEquals(1, fawltyTowers.countStalls());
    }

    @Test
    public void canRemoveStallFromPark(){
        assertEquals(0, fawltyTowers.countStalls());
        IceCreamVan iceCreamVan = new IceCreamVan("Mr Whippy", "Bob Whippy", 4, 8);
        fawltyTowers.addStall(iceCreamVan);
        assertEquals(1, fawltyTowers.countStalls());
        fawltyTowers.removeStall(iceCreamVan);
        assertEquals(0, fawltyTowers.countStalls());
    }

    @Test
    public void canGetRollercoaster(){
        Rollercoaster rollercoaster = new Rollercoaster("Tooth Chipper", 9);
        fawltyTowers.addAttraction(rollercoaster);
        assertEquals("Tooth Chipper", fawltyTowers.getRollercoaster().getName());
    }

    @Test
    public void canGetRating(){
        Rollercoaster rollercoaster = new Rollercoaster("Tooth Chipper", 9);
        fawltyTowers.addAttraction(rollercoaster);
        assertEquals(9, fawltyTowers.getRollercoaster().getRating());

    }

}