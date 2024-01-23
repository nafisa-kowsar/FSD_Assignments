package com.hexaware.springannotations.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
@Scope("prototype")
//@Service
//@Repository
public class Employee {
	
	private int eid;
	private String ename;
	private Address addr;
	


	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Employee(int eid, String ename, Address addr) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.addr = addr;
	}

	public Employee() {
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	

}
