package com.company;

import java.util.UUID;

public class Transaction {
    UUID transactionId;
    String dateOfTransaction;
    UUID customerID;
    UUID itemID;
    boolean returner(){
        return true;//TODO
    }
    Double amount;
    Double totalPrice;
    String discountCode;
    String status(boolean trueFalse){
        if(trueFalse){
            return  "success";

        }
        else {
            return "failure";
        }
    }
}
