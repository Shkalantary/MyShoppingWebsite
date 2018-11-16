//package com.fdmgroup.controller;
//
//
//import com.fdmgroup.dao.UserDao;
//import com.fdmgroup.model.User;
//import com.fdmgroup.model.UserSession;
//import com.fdmgroup.view.DashboardView;
//import com.fdmgroup.view.HomeView;
//
//public class AuthenticationController {
//
//	private DashboardView dashboardView;
//	private HomeView homeView;
//	private UserDao userDao;
//	
//	
//	public AuthenticationController() {
//		super();
//	}
//
//	public AuthenticationController(DashboardView dashboardView, HomeView homeView) {
//		super();
//		this.dashboardView = dashboardView;
//		this.homeView = homeView;
//		
//	}
//
//	public void login(String username, String password) {
//		User user = (User) userDao.findByUsername(username);
//		if (user != null && user.getPassword().equals(password)) {
//			UserSession.setLoggedInUser(user);
//			dashboardView.showDashboard();
//			return;
//		}
//		
//		homeView.showLoginOptions(true);
//	}
//
//	public void logout() {
//		UserSession.setLoggedInUser(null);
//		homeView.showInitialOptions(true);
//	}
//
//	public DashboardView getDashboardView() {
//		return dashboardView;
//	}
//
//	public void setDashboardView(DashboardView dashboardView) {
//		this.dashboardView = dashboardView;
//	}
//
//	public HomeView getHomeView() {
//		return homeView;
//	}
//
//	public void setHomeView(HomeView homeView) {
//		this.homeView = homeView;
//	}
//
//	
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////package com.fdmgrouop.controller;
////
////
////import com.fdmgroup.dao.UserDao;
////import com.fdmgroup.model.User;
////import com.fdmgroup.model.UserSession;
////import com.fdmgroup.view.DashboardView;
////import com.fdmgroup.view.HomeView;
////
////public class AuthenticationController {
////
////	private DashboardView dashboardView;
////	private HomeView homeView;
////	private UserDao userDao;
////	
////	public AuthenticationController() {
////		super();
////	}
////
////	public AuthenticationController(DashboardView dashboardView, HomeView homeView, UserDao userDao) {
////		super();
////		this.dashboardView = dashboardView;
////		this.homeView = homeView;
////		this.userDao = userDao;
////	}
////
////	public void login(String username, String password) {
////		User user = userDao.findByUsername(username);
////		if (user != null && user.getPassword().equals(password)) {
////			UserSession.setLoggedInUser(user);
////			dashboardView.showDashboard();
////			return;
////		}
////		
////		homeView.showLoginOptions(true);
////	}
////
////	public void logout() {
////		UserSession.setLoggedInUser(null);
////		homeView.showInitialOptions(true);
////	}
////
////	public void register(String username, String password, String email){
////
////			User u = new User(username,password,email);
////			User createdUser = userDao.create(u);
////			
////			if (createdUser != null){
////				System.out.println("Registration successful.");
////				UserSession.setLoggedInUser(createdUser);
////				dashboardView.showDashboard();
////			}else{
////				System.out.println("Error registration not successful");
////				dashboardView.showDashboard();
////			}
////			
////		}
////	
////	public DashboardView getDashboardView() {
////		return dashboardView;
////	}
////
////	public void setDashboardView(DashboardView dashboardView) {
////		this.dashboardView = dashboardView;
////	}
////
////	public HomeView getHomeView() {
////		return homeView;
////	}
////
////	public void setHomeView(HomeView homeView) {
////		this.homeView = homeView;
////	}
////
////	public UserDao getUserDao() {
////		return userDao;
////	}
////
////	public void setUserDao(UserDao userDao) {
////		this.userDao = userDao;
////	}
////}
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
