package com.hexaware.HotelManagementWithMappings.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Role {
	@Id
    private Long RoleID;
    private String RoleName;
    
    @OneToMany(mappedBy = "role")
    private List<UserRole> userRoles;
    
    public Role() {
		
	}
    
	public Long getRoleID() {
		return RoleID;
	}
	public void setRoleID(Long roleID) {
		RoleID = roleID;
	}
	public String getRoleName() {
		return RoleName;
	}
	public void setRoleName(String roleName) {
		RoleName = roleName;
	}

    
}


    



