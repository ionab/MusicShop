package inventory.instruments;

public class Trumpet extends Instrument {
    public Trumpet(String name, double stock_value, double sell_price, String brand, String model, String material, InstrumentTypes instrumentTypes) {
        super(name, stock_value, sell_price, brand, model, material, instrumentTypes);
    }

    public String play() {
        return "Toot toot";
    }
}
