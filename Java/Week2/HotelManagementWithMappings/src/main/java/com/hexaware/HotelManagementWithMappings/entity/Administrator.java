package com.hexaware.HotelManagementWithMappings.entity ;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Administrator {
	
	@Id
    private Long AdminID;
    private String UserName;
    private String FirstName;
    private String LastName;
    private String Password;
    private String Email;
    
    
    
	public Administrator() {
	}
	
	public Long getAdminID() {
		return AdminID;
	}
	public void setAdminID(Long adminID) {
		AdminID = adminID;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

   
}
