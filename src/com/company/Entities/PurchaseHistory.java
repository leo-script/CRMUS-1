package com.company.Entities;

public class PurchaseHistory {
    private String customerId;
    private String customerState;
    private String orderPurchaseTimestamp;
    private String productId;
    private String productCategoryName;
    private double price;
    private double freightValue;
    private double purchaseSum;

    public PurchaseHistory(String customerId, String customerState, String orderPurchaseTimestamp, String productId, String productCategoryName, double price, double freightValue, double purchaseSum) {
        this.customerId = customerId;
        this.customerState = customerState;
        this.orderPurchaseTimestamp = orderPurchaseTimestamp;
        this.productId = productId;
        this.productCategoryName = productCategoryName;
        this.price = price;
        this.freightValue = freightValue;
        this.purchaseSum = purchaseSum;
    }

    @Override
    public String toString() {
        return "PurchaseHistory{" +'\n'+
                "customerId='" + this.customerId + '\'' +'\n'+
                ", customerState='" + this.customerState + '\'' +'\n'+
                ", orderPurchaseTimestamp='" + this.orderPurchaseTimestamp + '\'' +'\n'+
                ", productId='" + this.productId + '\'' +
                ", productCategoryName='" + this.productCategoryName + '\'' +'\n'+
                ", price=" + this.price +'\n'+
                ", freightValue=" + this.freightValue +'\n'+
                ", purchaseSum=" + this.purchaseSum +'\n'+
                '}';
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }

    public String getOrderPurchaseTimestamp() {
        return orderPurchaseTimestamp;
    }

    public void setOrderPurchaseTimestamp(String orderPurchaseTimestamp) {
        this.orderPurchaseTimestamp = orderPurchaseTimestamp;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
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

    public double getPurchaseSum() {
        return purchaseSum;
    }

    public void setPurchaseSum(double purchaseSum) {
        this.purchaseSum = purchaseSum;
    }
}
