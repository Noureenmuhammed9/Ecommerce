/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

/**
 *
 * @author moham
 */
public class Order {
    private int customerId;
    private int orderId;
    int nProducts;
    private float totalPrice=0;
    protected Product[] products;
    
    public Order(int customerId, int orderId, Product[] products, float totalPrice){ 
     this.customerId = customerId;
     this.orderId = orderId;
     this.products=products;
     this.totalPrice = totalPrice;
    
}

    public void setnProducts(int nProducts) {
        this.nProducts = nProducts;
    }

    public void setProducts(Product newProduct,int index) {
       if(index>=0 && index<products.length){
           this.products[index]=newProduct;
           totalPrice+=newProduct.getPrice();
       }
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }
    
    
    public void PrintOrderInfo(){
        System.out.println("order id: "+orderId);
        System.out.println("customer id "+customerId);
        System.out.println("products: ");
        for (Product product : products){
            System.out.println(product.getName()+ "- $ " + product.getPrice());
        }
        System.out.println("total is "+totalPrice);
 }  

    void setProduct(ElectronicProduct p1, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setProduct(ClothingProduct p2, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setProduct(BookProduct p3, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
