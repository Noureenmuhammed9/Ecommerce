/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

/**
 *
 * @author moham
 */
public class ElectronicProduct extends Product{
  String brand;
  int warrantyPeriod;
  
  public ElectronicProduct(int productId,String name,float price,String brand,int warrantyPeriod){
      super(productId,name,price);
      this.brand=brand;
      this.warrantyPeriod=warrantyPeriod;
  }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
  
  
    
}
