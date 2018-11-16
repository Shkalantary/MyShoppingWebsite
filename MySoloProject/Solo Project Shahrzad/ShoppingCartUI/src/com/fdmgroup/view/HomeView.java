//package com.fdmgroup.view;
//
//import java.util.Scanner;
//
////import com.fdmgroup.controller.AuthenticationController;
////import com.fdmgroup.controller.HomeController;
//
//public class HomeView {
//
//	private Scanner scanner;
//	private com.fdmgroup.controller.HomeController homeController;
//	private com.fdmgroup.controller.AuthenticationController authenticationController;
//	
//	public HomeView() {
//		super();
//	}
//	
//	public HomeView(Scanner scanner) {
//		super();
//		this.scanner = scanner;
//	}
//	
//	public HomeView(Scanner scanner, com.fdmgroup.controller.HomeController homeController, com.fdmgroup.controller.AuthenticationController authenticationController) {
//		super();
//		this.scanner = scanner;
//		this.homeController = homeController;
//		this.authenticationController = authenticationController;
//	}
//
//	public void showInitialOptions(boolean showLogoutMessage) {
//		if (showLogoutMessage) {
//			System.out.println("You logged out successfully.");
//		}
//		
//		System.out.println("Welcome to my Solo Project Version 1.0.0");
//		System.out.println("Please choose one of the options below:");
//		System.out.println("1) Logout");
//		System.out.println("2) log in");
//		System.out.println("3) register");
//		System.out.println("-------------------------------");
//		String userInput = scanner.nextLine();
//		
//		switch (userInput) {
//		case "1"://log out
//			System.out.println("Thanks, Goodbye!");
//			System.exit(0);
//			break;
//		case "2":// log in
//			showLoginOptions(false);
//			break;
//		case "3":// register
//			showRegisterOptions();
//			break;
//		default:
//			System.out.println("The input is invalid.");
//			showInitialOptions(false);
//		}
//	}
//
//	private void showRegisterOptions() {
//		System.out.println("Register");
//		System.out.println("Please enter firstname: ");
//		String fname = scanner.nextLine();
//		System.out.println("Please enter lastname: ");
//		String lname = scanner.nextLine();
//		System.out.println("Please enter username: ");
//		String username = scanner.nextLine();
//		System.out.println("Please enter password: ");
//		String password = scanner.nextLine();
//		System.out.println("Please confirm password: ");
//		String password2 = scanner.nextLine();
//		if(! (password.equals(password2)))
//		{
//			System.out.println("Passwords do not match! please try again!");
//		}
//		authenticationController.register(username, password, email);
//	}
//
//	public void showLoginOptions(boolean showError) {
//		if (showError) {
//			System.out.println("Username/Password is wrong.");
//		}
//		
//		System.out.println("Login");
//		System.out.println("Please enter username: ");
//		String username = scanner.nextLine();
//		System.out.println("Please enter password: ");
//		String password = scanner.nextLine();
//		
//		authenticationController.login(username, password);
//	}
//
//	public Scanner getScanner() {
//		return scanner;
//	}
//
//	public void setScanner(Scanner scanner) {
//		this.scanner = scanner;
//	}
//
//	public com.fdmgroup.controller.HomeController getHomeController() {
//		return homeController;
//	}
//
//	public void setHomeController(com.fdmgroup.controller.HomeController homeController) {
//		this.homeController = homeController;
//	}
//
//	public com.fdmgroup.controller.AuthenticationController getAuthenticationController() {
//		return authenticationController;
//	}
//
//	public void setAuthenticationController(com.fdmgrouop.controller.AuthenticationController authenticationController) {
//		this.authenticationController = authenticationController;
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
