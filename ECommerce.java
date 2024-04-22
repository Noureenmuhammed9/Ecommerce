/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecommerce;

/**
 *
 * @author moham
 */
import java.util.Scanner;
public class ECommerce {
    public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  ElectronicProduct p1 = new ElectronicProduct(1,"smartphone",599.9F,"samsung",1);
  ClothingProduct p2 =new ClothingProduct(2,"T-shirt",19.99F,"Medium","cotton");
  BookProduct p3 = new BookProduct(3,"OOP",39.99F,"O'Reilly","X publications");
        System.out.println("Welcome to Ecommerse system");
        Customer c1 = new Customer();
        System.out.println("please enter your name");
        String name=input.nextLine();
        c1.setName(name);
        System.out.println("please enter your id ");
        int id=input.nextInt();
        c1.setCustomerId(id);
        System.out.println("please enter your address");
        String address=input.next();
        input.nextLine();
        c1.setAddress(address);
        System.out.println("how many products you want to add");
        int nProducts = input.nextInt();
        Product[] products = new Product[nProducts];
        Cart cart = new Cart(nProducts, products, id);
        for (int i=0;i<nProducts;i++){
            System.out.println("which product would you like to add? 1-smartphone 2-tshirt 3-OOP");
            int choice=input.nextInt();
            switch(choice){
                case 1:
                    cart.addProduct(p1,i);
                    break;
                case 2:
                    cart.addProduct(p2,i);
                    break;
                case 3:
                    cart.addProduct(p3,i);
                    break;
                default:
                    System.out.println("please choose among given choices");
                    
            }
            
        }
        System.out.println("your total is "+cart.calculatePrice()+" would you like to place order? 1-yes 2-no");
        int choice2=input.nextInt();
        switch(choice2){
            
            case 1:
                cart.placeOrder();
                break;
            case 2:
                System.out.println("Order cancelled");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        

    }
}
