package org.koushik.javabrains.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails 
{
	@Id
	private int userid;
	private String username;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
