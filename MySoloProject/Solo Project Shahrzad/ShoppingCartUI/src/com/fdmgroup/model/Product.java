package com.fdmgroup.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Products")
@NamedQueries({
	@NamedQuery(name="product.findAll", query="SELECT p FROM Product p"),
	@NamedQuery(name="product.findByProductName", query="SELECT p FROM Product p WHERE p.pname LIKE :pname")
})
public class Product implements IStorable{
 
	//private static final long serialVersionUID = -1000119078147252957L;
 
	@Id
	@Column(name = "Pid", length = 20, nullable = false)
	@GeneratedValue (strategy = GenerationType.AUTO)
    private int pid;
	
	@Column(name = "PName", length = 255, nullable = false)
    private String pname;
	
	@Column(name = "Price", nullable = false)
    private double price;
    
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.MERGE)
	private Order order;
 
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	private List<Order> orders;
	
    public Product() {
    }
 
  
    public int getPid() {
        return pid;
    }
 
    public void setPid(int id) {
        this.pid = id;
    }
 
    public String getName() {
        return pname;
    }
 
    public void setPName(String name) {
        this.pname = name;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }

 
}