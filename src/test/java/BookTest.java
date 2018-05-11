import org.junit.Before;
import inventory.misc_items.Book;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("test book", 6.00, 7.00, "test author", "test title");
    }

    @Test
    public void canGetName() {
        assertEquals("test book", book.getName());
    }
    @Test
    public void canGetStockValue(){
        assertEquals(6.00, book.getStock_value(), 0.01);
    }
    @Test
    public void canGetSaleValue() {
        assertEquals(7.00, book.getSell_price(), 0.01);
    }

    @Test
    public void canGetAuthor() {
        assertEquals("test author", book.getAuthor());
    }

    @Test
    public void canGetTitle() {
        assertEquals("test title", book.getTitle());
    }
}
