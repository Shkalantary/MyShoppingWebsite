package com.fdmgroup.model;


import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="TABLE_USERS_SH")
@DiscriminatorColumn(name="user_type", discriminatorType=DiscriminatorType.STRING, length=5)
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

@NamedQueries({
	@NamedQuery(name="user.findAll", query="SELECT u FROM User u"),
	@NamedQuery(name="user.findByUserNameAndPassword", query="SELECT u FROM User u where u.username LIKE :fname AND u.password LIKE :pw"),
	@NamedQuery(name="user.findByUserName", query="SELECT u FROM User u where u.username LIKE :uname")	
})
public class User implements IStorable {
	
	@Id  
	@Column(name="user_id", length=6)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(nullable = false, unique=true, length=30)
	private String username;
	
	@Column(name="pw", nullable=false, length=30)
	private String password;
	
	
	@Column(nullable=false)
	private String email;
	
	
	public int getId() {
		return id;
	}


	public User(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public User() {
		super();
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}
	
}
