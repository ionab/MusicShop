import Inventory.instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("test guitar", 90.00, 100.00, "Les Paul", "Guitar Model", "Wood");
    }


    @Test
    public void canGetName() {
        assertEquals("test guitar", guitar.getName());
    }
}
