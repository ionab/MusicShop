package inventory.misc_items;

import behaviours.ISell;
import inventory.Item;

public class Book extends Item implements ISell{
    private String author;
    private String title;

    public Book(String name, double stock_value, double sell_price, String author, String title) {
        super(name, stock_value, sell_price);
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
