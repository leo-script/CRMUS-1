package com.company.Entities;

public class GeneralInformation {
    private int numberOfProducts;
    private int categoriesNumber;
    private int totalNumberOfUnicClients;
    private int numberOfOrders;
    private int numberDeliveredOrders;

    public GeneralInformation(int numberOfProducts, int categoriesNumber, int totalNumberOfUnicClients, int numberOfOrders, int numberDeliveredOrders) {
        this.numberOfProducts = numberOfProducts;
        this.categoriesNumber = categoriesNumber;
        this.totalNumberOfUnicClients = totalNumberOfUnicClients;
        this.numberOfOrders = numberOfOrders;
        this.numberDeliveredOrders = numberDeliveredOrders;
    }

    public GeneralInformation() {
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public int getCategoriesNumber() {
        return categoriesNumber;
    }

    public void setCategoriesNumber(int categoriesNumber) {
        this.categoriesNumber = categoriesNumber;
    }

    public int getTotalNumberOfUnicClients() {
        return totalNumberOfUnicClients;
    }

    public void setTotalNumberOfUnicClients(int totalNumberOfUnicClients) {
        this.totalNumberOfUnicClients = totalNumberOfUnicClients;
    }

    public int getNumberOfOrders() {
        return numberOfOrders;
    }

    public void setNumberOfOrders(int numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }

    public int getNumberDeliveredOrders() {
        return numberDeliveredOrders;
    }

    public void setNumberDeliveredOrders(int numberDeliveredOrders) {
        this.numberDeliveredOrders = numberDeliveredOrders;
    }

    @Override
    public String toString() {
        return "GeneralInformation{" +"\n"+
                "numberOfProducts=" + numberOfProducts +"\n"+
                ", categoriesNumber=" + categoriesNumber +"\n"+
                ", totalNumberOfUnicClients=" + totalNumberOfUnicClients +"\n"+
                ", numberOfOrders=" + numberOfOrders +"\n"+
                ", numberDeliveredOrders=" + numberDeliveredOrders +"\n"+
                '}';
    }
}
