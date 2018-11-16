package com.fdmgroup.controller;

import java.util.Date;
import java.util.Random;

import com.fdmgroup.model.Order;
import com.fdmgroup.model.Product;
import com.fdmgroup.model.ShoppingCart;
import com.fdmgroup.model.UserSession;

public class ShoppingCartController {

	ShoppingCart sc = new ShoppingCart();
	
	public void resetCart() {
		sc.getCartList().clear();
	}
	
    public double getAmountTotal() {
        double total = 0;
        for (Product product : sc.getCartList()) {
            total += product.getPrice();
        }
        return total;
    }
    
    public void addToCart(Product p, int quantity){
    	
    	sc.addProduct(p, quantity);
    }
    
    public void removeProduct(int pid){
    	
    	sc.removeProduct(pid);
    }
    public void checkout(String cardname, String cardnumber, String expdate){
    	
    	Random rand = new Random();
    	int orderNumber  = rand.nextInt(50000) + 1;
    	Date date=java.util.Calendar.getInstance().getTime();
    	Order myorder = new Order(date, orderNumber, getAmountTotal(), UserSession.getLoggedInUser().getUsername(), UserSession.getLoggedInUser().getId());
    	
    }
}
