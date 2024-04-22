/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

/**
 *
 * @author moham
 */
public class Customer {
private int CustomerId;
private String name;
private String address;

    public void setCustomerId(int CustomerId) {
        this.CustomerId = CustomerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    

}
