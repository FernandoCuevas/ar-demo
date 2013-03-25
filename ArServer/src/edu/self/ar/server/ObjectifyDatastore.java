package edu.self.ar.server;

import java.util.List;

public class ObjectifyDatastore implements IDatastore {

	@Override
	public List<User> getFriends(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateLastKnownLocation(User user, Location location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(User newUser) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(User newUser) {
		OfyService.ofy().save().entity(newUser).now();
	}

	public List<User> listUsers() {
		return OfyService.ofy().load().type(User.class).list();
	}

}
