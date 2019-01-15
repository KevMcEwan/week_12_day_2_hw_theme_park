import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(14, 150, 20);
    }

    @Test
    public void canGetAge(){
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void canGetHeight(){
        assertEquals(150, visitor.getHeight());
    }

    @Test
    public void canGetMoney(){
        assertEquals(20, visitor.getMoney());
    }
}
