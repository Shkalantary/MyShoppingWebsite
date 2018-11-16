package com.fdmgroup.model;

import java.util.ArrayList;
import java.util.List;
 
public class ShoppingCart {
 
    private  List<Product> cartList;
 
	public ShoppingCart() {
		super();
		cartList  = new ArrayList<Product>();
	}


	public List<Product> getCartList() {
		return cartList;
	}

 
    public void addProduct(Product product, int quantity) {
    	
    	for(int i=0; i<quantity; i++){
    		cartList.add(product);
    	}
    }
 
    public void removeProduct(int pid) {
    	for(int i=0; i<cartList.size(); i++)
    	{
    		if(cartList.get(i).getPid() == pid)
    		{
    			cartList.remove(i);
    		}
    	}
    }

	@Override
	public String toString() {
		return "ShoppingCart [cartList=" + cartList + "]";
	}
 
}