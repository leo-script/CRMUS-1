package com.company.Entities;

public class FavouriteCategories {
    private String productCategoryName;
    private double orderItems;
    private double price;
    private double freightValue;
    private double totalPrice;

    public FavouriteCategories(String productCategoryName, double orderItems, double price, double freightValue, double totalPrice) {
        this.productCategoryName = productCategoryName;
        this.orderItems = orderItems;
        this.price = price;
        this.freightValue = freightValue;
        this.totalPrice = totalPrice;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public double getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(double orderItems) {
        this.orderItems = orderItems;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getFreightValue() {
        return freightValue;
    }

    public void setFreightValue(double freightValue) {
        this.freightValue = freightValue;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "FavouriteCategories{" +
                "productCategoryName='" + productCategoryName + '\'' +
                ", orderItems=" + orderItems +
                ", price=" + price +
                ", freightValue=" + freightValue +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
