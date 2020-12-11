package com.jspStudy.ex;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class helloWorld
 */
@WebServlet("/joinOk")
public class joinOk extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public joinOk() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 actionDo(request , response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 Connection connection;
		 Statement statement;
		 ResultSet resultSet;
		 PreparedStatement pre;
		 
		 
		 String name = request.getParameter("name");
		 String id = request.getParameter("id");
		 String pw = request.getParameter("pw");
		 String phoneNum = request.getParameter("phone1");
		 String phone2 = request.getParameter("phone2");
		 String phone3 = request.getParameter("phone3");
		 String gender = request.getParameter("gender");
		 
		 System.out.println(id + pw + name);
//		 String query = "insert into joinTable values('"+ name + "','" + id + "','" + pw + "', '" + phoneNum + "','" + gender + "','" + phone2 +"','" + phone3 + "')";
		
		 try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			 String query2 = "insert into joinTable values(?,?,?,?,?,?,?)";
			 pre = connection.prepareStatement(query2);
			 
			 pre.setString(1, name);
			 pre.setString(2, id);
			 pre.setString(3, pw);
			 pre.setString(4, phoneNum);
			 pre.setString(5, phone2);
			 pre.setString(6, phone3);
			 pre.setString(7, gender);
			 
			 int i = pre.executeUpdate();
			
//			 statement = connection.createStatement();
//			 int i= statement.executeUpdate(query);
			 if(i==1) {
				 System.out.println("insert sucess");
				 response.sendRedirect("joinResult.jsp");
			 }else {
				 System.out.println("insert fail");
				 response.sendRedirect("joinfile.jsp");
			 }
		 }catch(Exception e){
			 System.out.println(e);
		 }
	}

}
