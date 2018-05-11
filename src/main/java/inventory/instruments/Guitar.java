package inventory.instruments;

public class Guitar extends Instrument {
    public Guitar(String name, double stock_value, double sell_price, String brand, String model, String material, InstrumentTypes instrumentTypes) {
        super(name, stock_value, sell_price, brand, model, material, instrumentTypes);
    }

}