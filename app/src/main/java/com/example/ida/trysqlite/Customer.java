package com.example.ida.trysqlite;

/**
 * Created by Ida on 2017-04-06.
 */

public class Customer {
    private String firstName;
    private String lastName;
    private String address;
    private String tele;
    private int id;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String address, String tele, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.tele = tele;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
