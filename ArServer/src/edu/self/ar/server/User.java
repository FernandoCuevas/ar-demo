package edu.self.ar.server;

import java.util.List;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class User {
	@Id
	public String phone;
	public String name;
	public Location lastKnownLocation;
	public List<String> friendsPhone;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public User(String phone, String name, Location lastKnownLocation,
			List<String> friendsPhone) {
		super();
		this.phone = phone;
		this.name = name;
		this.lastKnownLocation = lastKnownLocation;
		this.friendsPhone = friendsPhone;
	}




	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Location getLastKnownLocation() {
		return lastKnownLocation;
	}
	public void setLastKnownLocation(Location lastKnownLocation) {
		this.lastKnownLocation = lastKnownLocation;
	}
	public List<String> getFriendsPhone() {
		return friendsPhone;
	}
	public void setFriendsPhone(List<String> friendsPhone) {
		this.friendsPhone = friendsPhone;
	}
	 
	

}
