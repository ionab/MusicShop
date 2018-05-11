import inventory.instruments.Guitar;
import inventory.instruments.InstrumentTypes;
import org.junit.Before;
import org.junit.Test;
import shops.Shop;
import inventory.misc_items.Book;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Book book;
    Guitar guitar;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar("test guitar", 90.00, 100.00, "Test Guitar Brand", "Test Guitar Model", "Wood", InstrumentTypes.GUITAR);
        book = new Book("test book", 6.00, 7.00, "test author", "test title");
    }

    @Test
    public void ArrayListStartsEmpty() {
        assertEquals(0, shop.getItemsSize());
    }

    @Test
    public void canAddItemToArrayList(){
        shop.addItem(book);
        shop.addItem(guitar);
        assertEquals(2, shop.getItemsSize());
    }
    @Test
    public void canCanRemoveItemfromArrayList(){
        shop.addItem(book);
        shop.addItem(guitar);
        shop.removeItem(book);
        assertEquals(1, shop.getItemsSize());
    }

    @Test
    public void canCalculateTotalProfit(){
        shop.addItem(book);
        shop.addItem(guitar);
        assertEquals(21, shop.calculateTotalProfit());
    }

}
