package com.fdmgroup.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.fdmgroup.model.Product;

public class ProductDao {
	
	private DbConnection con;
	private EntityManager em;
	
	public ProductDao(){
		super();
		con = DbConnection.getInstance();
	}

	public boolean create(Product p){
		System.out.println(p);
		em = con.getEntityManager();
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		return true;
	}
	
	public boolean delete(int id){
		em = con.getEntityManager();
		Product managedProduct = em.find(Product.class, id);
		em.getTransaction().begin();
		em.remove(managedProduct);
		em.getTransaction().commit();
		em.close();
		return true;
	}

	public boolean softDelete(int id){
		em = con.getEntityManager();
		Product managedProduct = em.find(Product.class, id);
		em.getTransaction().begin();
		//managedProduct.setActive(false);
		em.getTransaction().commit();
		em.close();
		return true;
	}
	
	public List<Product> findAll(){
		em = con.getEntityManager();
		TypedQuery<Product> query = em.createNamedQuery("product.findAll", Product.class);	
		List<Product> products = query.getResultList();
		em.close();
		return products;
	}

	public List<Product> findByProductName(String pname) {
		em = con.getEntityManager();
		System.out.println("PNAME========" + pname );
		TypedQuery<Product> query = em.createNamedQuery("product.findByProductName", Product.class);
		query.setParameter("pname", pname + "%");
		List<Product> products = query.getResultList();
		em.close();
		
		return products;
	}
	
	public Product findById(int id){
		em = con.getEntityManager();
		Product p = em.find(Product.class, id);
		em.close();
		return p;
	}

//	public List<Product> findByUsername(String pname) {
//		em = con.getEntityManager();
//		TypedQuery<Product> query = em.createNamedQuery("product.findByname", Product.class);
//		query.setParameter("uname", pname);
//		Product p = query.getSingleResult();
//		List<Product> products = query.getResultList();
//		em.close();
//		
//		if (products != null && products.size() == 1){
//			return products;
//		}
//		return null;
//	}
//	
//	public List<Product> findByType(Class type){
//		em = con.getEntityManager();
//		TypedQuery<Product> query = em.createNamedQuery("product.findByType", Product.class);
//		query.setParameter("type", type);
//		List<Product> products = query.getResultList();
//		em.close();
//		return products;
//	}
//	

}