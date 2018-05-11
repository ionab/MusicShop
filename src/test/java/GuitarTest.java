import inventory.instruments.Guitar;
import inventory.instruments.InstrumentTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("test guitar", 90.00, 100.00, "Test Guitar Brand", "Test Guitar Model", "Wood", InstrumentTypes.GUITAR);
    }

    @Test
    public void canGetName() {
        assertEquals("test guitar", guitar.getName());
    }

    @Test
    public void canGetStockValue() {
        assertEquals(90.00, guitar.getStock_value(), 0.01);
    }

    @Test
    public void canGetSaleValue(){
        assertEquals(100.00, guitar.getSell_price(), 0.01);
    }

    @Test
    public void canGetBrand() {
        assertEquals("Test Guitar Brand", guitar.getBrand());
    }

    @Test
    public void canGetModel() {
        assertEquals("Test Guitar Model", guitar.getModel());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentTypes.GUITAR, guitar.getInstrumentTypes());
    }
    @Test
    public void canPlay() {
        assertEquals("Kerrang", guitar.play());
    }
    @Test
    public void canCalculateMarkUp(){
        assertEquals(10.00, guitar.calculateMarkUp(), 0.01);
    }
}
