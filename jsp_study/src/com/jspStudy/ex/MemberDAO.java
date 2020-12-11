package com.jspStudy.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
//	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
//	private String uid = "scott";
//	private String upw = "tiger";
	private DataSource dataSource;
	
	
	
	public MemberDAO() {
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			Context context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<MemberDTO> memberSelect(){
		ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
//			con = DriverManager.getConnection(url, uid ,upw);
			con=dataSource.getConnection();
			stmt= con.createStatement();
			rs = stmt.executeQuery("select * from jointable");
			
			while(rs.next()){
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String phonenum = rs.getString("phonenum");
				String phone2 = rs.getString("phone2");
				String phone3 = rs.getString("phone3");
				String gender = rs.getString("gender");
				
				MemberDTO dto = new MemberDTO(name, id, pw ,phonenum, phone2, phone3, gender);
				dtos.add(dto);
			}
		
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) rs.close();
				if(con != null) rs.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return dtos;
	}

}
