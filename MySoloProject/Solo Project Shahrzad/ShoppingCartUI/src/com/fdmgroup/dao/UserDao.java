package com.fdmgroup.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;


import com.fdmgroup.model.User;

public class UserDao {
	
	private DbConnection con;
	private EntityManager em;
	
	public UserDao() {
		super();
		// TODO Auto-generated constructor stub
		con=DbConnection.getInstance();
	}
	
/*public void create(User user)
{
	em=con.getEntityManager();
	em.getTransaction().begin();
	em.persist(user);
	em.getTransaction().commit();
	em.close();
	
	
}*/

public boolean create(User user)
{
	em=con.getEntityManager();
	em.getTransaction().begin();
	em.persist(user);
	em.getTransaction().commit();
	em.close();
	return true;
	
	
}

public List<User> findAll(){
	em=con.getEntityManager();
	TypedQuery<User> query= em.createNamedQuery("user.findAll", User.class);
	
	List<User> users=query.getResultList();
	em.close();
	return users;
	
	
}

public List<User> findByFirstName(String fname){
	em=con.getEntityManager();
	TypedQuery<User> query= em.createNamedQuery("user.findByFirstName", User.class);
	query.setParameter("fname", fname+"%");
	
	List<User> users=query.getResultList();
	em.close();
	return users;
	
	
}




public User findById(int id){
	em=con.getEntityManager();
	
	User user= em.find(User.class, id);
	em.close();
	return user;
	
	
}

public List<User> findByUsernameAndPassword(String uname, String password){
	em=con.getEntityManager();
	TypedQuery<User> query= em.createNamedQuery("user.findByUserNameAndPassword", User.class);
	query.setParameter("uname", uname);
	//query.setParameter("pw", password);
	User user= query.getSingleResult();
	List<User> users= query.getResultList();
	if(users!=null && users.size()==1)
	{
		return users;
	}
	
	
	em.close();
	return null;
	
	
	
}


public User findByUsername(String uname){
	em=con.getEntityManager();
	TypedQuery<User> query= em.createNamedQuery("user.findByUserName", User.class);
	query.setParameter("uname", uname);
	//User user= query.getSingleResult();
	List<User> users= query.getResultList();
	if(users!=null && users.size()==1)
	{
		return users.get(0);
	}
	
	
	em.close();
	return null;
}



public boolean delete(int id){
	em=con.getEntityManager();
	User managedUser= em.find(User.class, id);
	em.getTransaction().begin();
	em.remove(managedUser);
	em.getTransaction().commit();
	em.close();
	return true;
}

}
