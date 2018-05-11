package shops;

import inventory.Item;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Item> itemsArray;

    public Shop() {
      this.itemsArray = new ArrayList<Item>();
    }

    public int getItemsSize() {
        return itemsArray.size();
    }
    public void addItem(Item item){
        itemsArray.add(item);
    }
    public void removeItem(Item item){
        itemsArray.remove(item);
    }
    public double calculateTotalProfit(){
        double totalProfit = 0;
        for (Item item : itemsArray){
            totalProfit += item.calculateMarkUp();
        }
        return totalProfit;
    }
}
