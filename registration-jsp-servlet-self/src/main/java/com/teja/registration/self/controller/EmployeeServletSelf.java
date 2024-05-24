package com.teja.registration.self.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.teja.registration.self.dao.EmployeeDaoSelf;
import com.teja.registration.self.model.EmployeeSelf;

@WebServlet("/register")
public class EmployeeServletSelf extends HttpServlet {
	private static final long serialVersionUID = 1L;

	EmployeeDaoSelf employeeSelfDao = new EmployeeDaoSelf();
	
    public EmployeeServletSelf() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/EnterEmployeeDetails.jsp");
		dispatcher.forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("firstName");
		String secondName = request.getParameter("secondName");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");
		
		EmployeeSelf employee = new EmployeeSelf();
		employee.setFirstName(firstName);
		employee.setSecondName(secondName);
		employee.setUsername(username);
		employee.setPassword(password);
		employee.setAddress(address);
		employee.setContact(contact);
		
		try {
			employeeSelfDao.registerEmployeeDetails(employee);
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/EmployeeRegistered.jsp");
		dispatcher.forward(request,response);
		}
}
