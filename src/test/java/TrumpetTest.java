import inventory.instruments.InstrumentTypes;
import inventory.instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("test trumpet", 90.00, 100.00, "Test Trumpet Brand", "Test Trumpet Model", "Brass", InstrumentTypes.BRASS);
    }

    @Test
    public void canGetName() {
        assertEquals("test trumpet", trumpet.getName());
    }

    @Test
    public void canGetStockValue() {
        assertEquals(90.00, trumpet.getStock_value(), 0.01);
    }

    @Test
    public void canGetSaleValue(){
        assertEquals(100.00, trumpet.getSell_price(), 0.01);
    }

    @Test
    public void canGetBrand() {
        assertEquals("Test Trumpet Brand", trumpet.getBrand());
    }

    @Test
    public void canGetModel() {
        assertEquals("Test Trumpet Model", trumpet.getModel());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentTypes.BRASS, trumpet.getInstrumentTypes());
    }
    @Test
    public void canPlay() {
        assertEquals("Toot toot", trumpet.play());
    }
}
