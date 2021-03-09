package com.company;
import com.company.Controller.*;
import com.company.Entities.GeneralInformation;
import com.company.Entities.OrderInformation;
import com.company.Entities.PurchaseHistory;

import java.sql.SQLException;
import java.util.Scanner;

public class MyApplication {
    private final GeneralInformationController generalInformationController;
    private final FavouriteCategoriesController favouriteCategoriesController;
    private final OrderInformationController orderInformationController;
    private final CustomerController customerController;
    private final Scanner scanner;
    private final PurchaseHistoryController purchaseHistoryController;

    public MyApplication() throws SQLException, ClassNotFoundException {
        this.generalInformationController=new GeneralInformationController();
        this.scanner = new Scanner(System.in);
        this.customerController=new CustomerController();
        this.orderInformationController=new OrderInformationController();
        this.favouriteCategoriesController=new FavouriteCategoriesController();
        this.purchaseHistoryController=new PurchaseHistoryController();
    }

    public void start() {
        while(true) {
            System.out.println();
            System.out.println("Welcome to CRMUS!");
            System.out.println("Select option: ");
            System.out.println("1. Get customers by id");
            System.out.println("2. Top 5 categories");
            System.out.println("3. View general information");
            System.out.println("4. Get order information by id");
            System.out.println("5. Get purchase history by customer id");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.println("Enter option (1-5): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    System.out.println("Please enter id: ");
                    this.scanner.nextLine();
                    String id = this.scanner.nextLine();
                    getCustomerByIdMenu(id);
                }
                else if (option == 2) {
                    getFavouriteCategoriesMenu();

                }
                else if (option == 3) {
                    getGeneralInfoMenu();
                }
                else if(option == 4){
                    System.out.println("Please enter id: ");
                    this.scanner.nextLine();
                    String id = this.scanner.nextLine();
                    getOrderByIdMenu(id);
                }else if(option==5){
                    System.out.println("Please enter id:");
                    scanner.nextLine();
                    String id=scanner.nextLine();
                    getPurchaseHistoryMenu(id);
                }
                else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("********************");



        }
    }
    public void getPurchaseHistoryMenu(String id) throws SQLException{
        String response= purchaseHistoryController.getInfo(id);
        System.out.println(response);
    }
    public void getGeneralInfoMenu() throws SQLException {
        String response= generalInformationController.getInfo();
        System.out.println(response);
    }
    public void getCustomerByIdMenu(String customerId) throws SQLException {
        String response = customerController.getCustomerById(customerId);//TODO
        System.out.println(response);
    }
    public  void getOrderByIdMenu(String orderId){
        String response= orderInformationController.getOrderInformationById(orderId);
        System.out.println(response);
    }
    public void getFavouriteCategoriesMenu(){
        try {
            String[] favouriteCategories= favouriteCategoriesController.getFavouriteController();
            for(int i=0;i<favouriteCategories.length;i++){
                System.out.println(favouriteCategories[i]);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
