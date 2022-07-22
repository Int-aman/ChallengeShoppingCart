package com.ultralesson.challengeshoppingcart;

public class Items {
    private String itemName;
    private double itemPrice;
    private int itemNo;
    private int quantity;

    public Items(String itemName, double itemPrice, int itemNo, int quantity){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemNo = itemNo;
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemNo() {
        return itemNo;
    }

    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }
}
