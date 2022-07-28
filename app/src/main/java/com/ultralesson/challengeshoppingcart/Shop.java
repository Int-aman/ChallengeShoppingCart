package com.ultralesson.challengeshoppingcart;

import java.util.ArrayList;

public class Shop {
    private String shopName;

    public void shopTransaction(Consumer consumer){
        double amountPayable = 0;
        int  milkQuantity = 0;
        ArrayList<Items> items = new ArrayList<>();
        ShoppingCart cart = consumer.getCart();
        items = cart.getItems(); // Getting items in the cart

        for(Items item: items){
            amountPayable += item.getItemPrice() * item.getQuantity();
            if(item.getItemName().compareTo("milk") == 0){
                milkQuantity = item.getQuantity();
                milkQuantity += milkQuantity/2;
                item.setQuantity(milkQuantity);
            }
        } // Check if there are more than 2 items (2 milk products)
            // Apply offer

        if(consumer.getEwallet().getBalance() >= amountPayable && amountPayable >= 100){
            amountPayable -= 0.05*amountPayable;
        }

        // Check if discount is applicable
        // Apply discount

        System.out.println("Total amount payable: "+amountPayable);
        printItemList(items); // Display total items
        consumer.getEwallet().setBalance(consumer.getEwallet().getBalance()-amountPayable);
        System.out.println("Remaining E-walllet Balance :" + (consumer.getEwallet().getBalance()));
        // Display remaining wallet balance

    }


    public void printItemList(ArrayList<Items> items){
        for(Items item:items){
            System.out.println(item.getItemName()+" : "+item.getItemPrice()+" : "+item.getQuantity());
        }
    }


    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}
