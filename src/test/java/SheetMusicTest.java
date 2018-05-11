import inventory.misc_items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("test sheetmusic", 3.00, 5.00, "test composer");
    }

    @Test
    public void canGetName() {
        assertEquals("test sheetmusic", sheetMusic.getName());
    }

    @Test
    public void canGetStockValue(){
        assertEquals(3.00, sheetMusic.getStock_value(), 0.01);
    }
    @Test
    public void canGetSaleValue() {
        assertEquals(5.00, sheetMusic.getSell_price(), 0.01);
    }
    @Test
    public void canGetComposer(){
        assertEquals("test composer", sheetMusic.getComposer());
    }
}
