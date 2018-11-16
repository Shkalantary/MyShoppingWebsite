package com.fdmgroup.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;
 
@Entity
@Table(name = "Orders")
@NamedQueries({
@NamedQuery(name="order.findAll", query="SELECT o FROM Order o"),
@NamedQuery(name="order.findByCustomerUsername", query="SELECT o FROM Order o WHERE o.customerUserName LIKE :cuname")
})
public class Order implements IStorable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OrderID", length = 50)
    private int id;
    
    @Column(name = "Order_Date", nullable = false)
    private Date orderDate;
    
    @Column(name = "Order_Num", nullable = false, unique=true)
    private int orderNum;
    
    @Column(name = "OrderAmount", nullable = false)
    private double amount;
    
    @Column(name = "Customer_UserName", length = 255, nullable = false)
    private String customerUserName;
    
    @Column(name = "Customer_UserID", length = 50, nullable = false)
    private int userId;
    
    @ManyToMany
    private List<Product> pList;


    public Order(){
    	super();
    }
 
    public Order(Date orderDate, int orderNum, double amount, String customerUserName, int userId) {
		super();
		this.orderDate = orderDate;
		this.orderNum = orderNum;
		this.amount = amount;
		this.customerUserName = customerUserName;
		this.userId = userId;
	}

    public int getId() {
        return userId;
    }
 
    public void setId(int id) {
        this.userId = id;
    }
  
    public Date getOrderDate() {
        return orderDate;
    }
 
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
 
    public int getOrderNum() {
        return orderNum;
    }
 
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }
 
    public double getAmount() {
        return amount;
    }
 
    public void setAmount(double amount) {
        this.amount = amount;
    }
 
    public String getCustomerUserName() {
        return customerUserName;
    }
 
    public void setCustomerName(String customerName) {
        this.customerUserName = customerName;
    }
 
    public int getuserId() {
        return userId;
    }
 
    public void setuserId(int uId) {
        this.userId = uId;
    }

    
}
