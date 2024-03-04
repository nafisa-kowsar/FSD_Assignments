package com.hexaware.HotelManagementWithMappings.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class UserRole {
	
	@Id
    private Long UserRoleID;
	
	@ManyToMany(mappedBy = "userRoles")
    private List<User> users;
    
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Long RoleID;
    
    public UserRole() {
		
	}
	
	public Long getUserRoleID() {
		return UserRoleID;
	}
	public void setUserRoleID(Long userRoleID) {
		UserRoleID = userRoleID;
	}
	
	public Long getRoleID() {
		return RoleID;
	}
	public void setRoleID(Long roleID) {
		RoleID = roleID;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	

    
}
