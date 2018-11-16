package com.fdmgroup.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fdmgroup.dao.UserDao;
import com.fdmgroup.model.User;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Testing register servlet.......");
		String uname= request.getParameter("username");
		String pw= request.getParameter("password");
		String email= request.getParameter("email");
	
		
		UserDao userDao= new UserDao();
		User user = new User(uname,pw,email);
		
		System.out.println(user.toString());
		if(userDao.create(user)){
			System.out.println("Welcome New User***");
			//request.setAttribute("errorMsg","Login");
			RequestDispatcher rd= request.getRequestDispatcher("/WEB-INF/views/shoppingPage.jsp");
			rd.forward(request, response);
		}
		
		doGet(request, response);
	}

}
