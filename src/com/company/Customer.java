package com.company;

import java.util.UUID;

public class Customer {
    private String name;
    private UUID id=UUID.randomUUID();
    private String DOB;
    private String gender;
    private String phone_num;
    private String email;
    private String country;
    private int age_group;
    private String occupancy;
    private Double avaliable_funds;

    public void addFunds(int additional_balance){
        avaliable_funds+=avaliable_funds;
    }

    public void analyze(){
        //todo
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge_group() {
        return age_group;
    }

    public void setAge_group(int age_group) {
        this.age_group = age_group;
    }

    public String getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(String occupancy) {
        this.occupancy = occupancy;
    }

    public Double getAvaliable_funds() {
        return avaliable_funds;
    }

    public void setAvaliable_funds(Double avaliable_funds) {
        this.avaliable_funds = avaliable_funds;
    }

}
