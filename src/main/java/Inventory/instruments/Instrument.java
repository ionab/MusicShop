package Inventory.instruments;

import Inventory.Item;

public abstract class Instrument extends Item{

    private String brand;
    private String model;
    private String material;
    private InstrumentTypes instrumentTypes;

    public Instrument(String name, double stock_value, double sell_price, String brand, String model, String material, InstrumentTypes instrumentTypes) {
        super(name, stock_value, sell_price);
        this.brand = brand;
        this.model = model;
        this.material = material;
        this.instrumentTypes = instrumentTypes;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getMaterial() {
        return material;
    }

    public InstrumentTypes getInstrumentTypes() {
        return instrumentTypes;
    }
}
