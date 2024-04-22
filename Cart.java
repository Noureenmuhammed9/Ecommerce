/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

/**
 *
 * @author moham
 */
public class Cart {
    protected int orderId;
    int customerId ;
    protected int nProducts;
    protected Product[]products;
    
    public Cart (int nProducts, Product[]products, int customerId){
        this.nProducts= Math.abs(nProducts);
        this.products=new Product[nProducts];
        this.products = products;
        this.customerId = customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
    }
    public int getnProducts() {
        return nProducts;
    }
    public void addProduct(Product newProduct,int index){
        if(index>=0 && index<products.length){
            this.products[index]=newProduct;
        }
    }
    public void removeProduct(Product productToRemove){
        int newSize=products.length;
        for (int i=0;i<products.length;i++)
           if (products[i]==productToRemove){
             newSize--;  
           } else if (i<newSize){
               products[i]=products[i+1];
           }
    }
    public float calculatePrice(){
        float totalPrice=0;
        for (Product product : products){
            totalPrice+=product.getPrice();
        }
        return totalPrice;
    }
    public void placeOrder(){
       Order order = new Order(customerId, 1, products, calculatePrice());
       order.PrintOrderInfo();
    }
}

    