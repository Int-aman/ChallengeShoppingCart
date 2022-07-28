package com.ultralesson.challengeshoppingcart;

import java.util.ArrayList;

public class ShoppingCart {
    private String userName;
    private ArrayList<Items> items = new ArrayList<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
    }
}
