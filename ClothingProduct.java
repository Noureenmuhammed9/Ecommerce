/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

/**
 *
 * @author moham
 */
public class ClothingProduct extends Product {
    private String size;
    private String fabric;
    
 public ClothingProduct(int ProductId,String name,float price,String size,String fabric){
     super(ProductId,name,price);
     this.fabric=fabric;
     this.size=size;
 }   

    public void setSize(String size) {
        this.size = size;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getSize() {
        return size;
    }

    public String getFabric() {
        return fabric;
    }
    
    
    
}
