package com.ultralesson.challengeshoppingcart;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Consumer consumer = new Consumer("Shiv");
        ArrayList<Items> itemList= new ArrayList<>();
        itemList.add(new Items("milk",70,123,2));
        itemList.add(new Items("apple",20,229,1));
        itemList.add(new Items("newspaper",5,13,1));

        ShoppingCart cart = new ShoppingCart();
        cart.setItems(itemList);
        consumer.setCart(cart);

        shop.shopTransaction(consumer);
    }
}
