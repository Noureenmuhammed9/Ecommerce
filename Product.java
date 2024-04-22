/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

/**
 *
 * @author moham
 */
public class Product {
    protected int productId;
    protected String name;
    protected float price;
    
 public Product(int ProductId,String name, float price){
     this.price=price;
     this.name=name;
     this.productId=productId;
 }   
    

public void setProductId (int p){
  p=Math.abs(productId);
} 
public int getProductId (){
    return productId; 
} 
public void setName (String n){
  n=name;
} 
public String getName (){
    return name; 
}
public void setPrice (float pr){
  pr=Math.abs(price);
} 
public float getPrice (){
    return price; 
} 



}
    

