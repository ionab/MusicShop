package Inventory.instruments;

import Inventory.Item;

public abstract class Instrument extends Item{

    private String brand;
    private String model;
    private String material;

    public Instrument(String name, double stock_value, double sell_price, String brand, String model, String material) {
        super(name, stock_value, sell_price);
        this.brand = brand;
        this.model = model;
        this.material = material;
    }
}
