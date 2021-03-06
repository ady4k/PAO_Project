package storage.models;

import interfaces.IStorable;
import model.Inventory;

import java.util.ArrayList;

public class InventoryStorage implements IStorable<Inventory> {
    // all the inventory entities will be kept in an ArrayList
    private final static ArrayList<Inventory> inventories = new ArrayList<Inventory>();

    // CRUD methods
    @Override
    public void addNewItem(Inventory item) {
        inventories.add(item);
    }

    @Override
    public ArrayList<Inventory> getItem() {
        return inventories;
    }

    @Override
    public Inventory getItemByIndex(int index) {
        return inventories.get(index);
    }

    @Override
    public void updateItem(int index, Inventory item) {
        inventories.set(index, item);
    }

    @Override
    public void deleteItem(int index) {
        inventories.remove(index);
    }
}
