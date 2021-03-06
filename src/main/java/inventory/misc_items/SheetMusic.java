package inventory.misc_items;

import behaviours.ISell;
import inventory.Item;

public class SheetMusic extends Item implements ISell {

    public String composer;

    public SheetMusic(String name, double stock_value, double sell_price, String composer) {
        super(name, stock_value, sell_price);
        this.composer = composer;
    }

    public String getComposer() {
        return composer;
    }
}
