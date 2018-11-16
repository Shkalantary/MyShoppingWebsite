package com.fdmgroup.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.fdmgroup.model.Order;

public class OrderDao {
	
	private DbConnection con;
	private EntityManager em;
	
	public OrderDao(){
		super();
		con = DbConnection.getInstance();
	}

	public boolean create(Order o){
		System.out.println(o);
		em = con.getEntityManager();
		em.getTransaction().begin();
		em.persist(o);
		em.getTransaction().commit();
		em.close();
		return true;
	}
	
	public boolean delete(int id){
		em = con.getEntityManager();
		Order managedOrder = em.find(Order.class, id);
		em.getTransaction().begin();
		em.remove(managedOrder);
		em.getTransaction().commit();
		em.close();
		return true;
	}

	public boolean softDelete(int id){
		em = con.getEntityManager();
		//Order managedOrder = em.find(Order.class, id);
		em.getTransaction().begin();
		//managedProduct.setActive(false);
		em.getTransaction().commit();
		em.close();
		return true;
	}
	
	public List<Order> findAll(){
		em = con.getEntityManager();
		TypedQuery<Order> query = em.createNamedQuery("order.findAll", Order.class);	
		List<Order> orders = query.getResultList();
		em.close();
		return orders;
	}

	public List<Order> findByCustomerUsername(String cuname) {
		em = con.getEntityManager();
		System.out.println("CUNAME========" + cuname );
		TypedQuery<Order> query = em.createNamedQuery("order.findByCustomerUsername", Order.class);
		query.setParameter("cuname", cuname + "%");
		List<Order> orders = query.getResultList();
		em.close();
		
		return orders;
	}
	
	public Order findById(int id){
		em = con.getEntityManager();
		Order o = em.find(Order.class, id);
		em.close();
		return o;
	}



	

}