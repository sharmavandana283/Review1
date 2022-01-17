package com.Review1;

public class User {
	
	private String firstname ;
	private String lastname;
	private String address;
	private String phoneNo;
	
	public User(String firstname, String lastname, String address, String phoneNo)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phoneNo = phoneNo;			
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
		
    @Override
	public String toString()
	{
		return "\n User : " + getFirstname() +" " +getLastname() +"\n"+ getAddress() +"\n" + getPhoneNo();
	}
}
