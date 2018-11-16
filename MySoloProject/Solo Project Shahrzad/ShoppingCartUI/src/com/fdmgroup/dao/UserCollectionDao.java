package com.fdmgroup.dao;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.model.User;

public class UserCollectionDao implements IUserDao {

	private List<User> users = null;
	
	public UserCollectionDao() {
		super();

	}

	@Override
	public User create(User user) {
		User foundUser = findByUsername(user.getUsername());
		if (foundUser == null) {
			users.add(user);
			return user;
		}
		
		return null;
	}

	@Override
	public User update(User user) {
		User foundUser = findById(user.getId());
		
		if (user.getUsername() != null && !user.getUsername().isEmpty()) {
			foundUser.setUsername(user.getUsername());
		}
		if (user.getPassword() != null && !user.getPassword().isEmpty()) {
			foundUser.setPassword(user.getPassword());
		}
		if (user.getEmail() != null && !user.getEmail().isEmpty()) {
			foundUser.setEmail(user.getEmail());
		}

		return foundUser;
	}

	@Override
	public boolean remove(User user) {
		return users.remove(user);
	}
	
	@Override
	public User findById(int id) {
		
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		
		return null;
	}

	@Override
	public List<User> findAll() {
		return users;
	}

	@Override
	public User findByUsername(String username) {
		for (User user : users) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		
		return null;
	}

	@Override
	public List<User> findByFirstname(String firstname) {
		List<User> usersByFirstname = new ArrayList<>();
//		for (User user : users) {
//			if (user.getFirstname().equals(firstname)) {
//				usersByFirstname.add(user);
//			}
//		}
//		
		return usersByFirstname;
	}
}


















