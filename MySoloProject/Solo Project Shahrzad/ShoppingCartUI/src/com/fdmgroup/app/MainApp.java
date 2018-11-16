//package com.fdmgroup.app;
//
//import java.util.Scanner;
//
////import com.fdmgroup.controller.HomeController;
//import com.fdmgroup.dao.IUserDao;
//import com.fdmgroup.dao.UserCollectionDao;
//import com.fdmgroup.dao.UserDao;
//import com.fdmgroup.view.DashboardView;
//import com.fdmgroup.view.HomeView;
//
//public class MainApp {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		UserDao userDao = new UserDao();
//		
//		//Views
//		HomeView hv = new HomeView(scanner);
//		DashboardView dv = new DashboardView(scanner);
//		
//		//Controllers
//		com.fdmgroup.controller.HomeController hc = new com.fdmgroup.controller.HomeController();
//		com.fdmgrouop.controller.AuthenticationController ac = new com.fdmgrouop.controller.AuthenticationController();
//		
//		hc.setHomeView(hv);
//		ac.setDashboardView(dv);
//		ac.setHomeView(hv);
//		ac.setUserDao(userDao);
//		
//		hv.setAuthenticationController(ac);
//		hv.setHomeController(hc);
//		dv.setAuthenticationController(ac);
//		
//		
//		hc.showHome();
//		
//		scanner.close();
//	}
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
