package com.jspStudy.ex;

public class MemberDTO {
	private String name;
	private String id;
	private String pw;
	private String phonenum;


	private String phone2;
	private String phone3;
	private String gender;
	
	
	public MemberDTO(String name, String id, String pw, String phonenum,  String phone2, String phone3, String gender) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.phonenum = phonenum;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.gender = gender;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getPhone3() {
		return phone3;
	}

	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
