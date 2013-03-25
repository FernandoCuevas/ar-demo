package edu.self.ar.server;

import java.util.List;

public interface IDatastore {

	List<User> getFriends(User user);

	void updateLastKnownLocation(User user, Location location);

	boolean exists(User newUser);

	void  add(User newUser);

}
