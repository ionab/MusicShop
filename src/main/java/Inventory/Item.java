package Inventory;

public abstract class Item {
    private String name;
    private double stock_value;
    private double sell_price;

    public Item(String name, double stock_value, double sell_price) {
        this.name = name;
        this.stock_value = stock_value;
        this.sell_price = sell_price;
    }

    public String getName() {
        return name;
    }

    public double getStock_value() {
        return stock_value;
    }

    public double getSell_price() {
        return sell_price;
    }
}
