package edu.self.ar.server;

import java.util.ArrayList;
import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;

@Api(name = "ar-server")
public class LocationEndpoint {

	private IDatastore dataStore = new ObjectifyDatastore();
	private final double DEFAULT_MAX_DISTANCE_IN_METERS = 100;

	@ApiMethod(name = "location.getnearbyfriends", httpMethod = "GET")
	public List<User> getNearbyFriends(User user, Location location,double maxDistanceInMeters) {
		double max;
		if(maxDistanceInMeters>0){
			max = maxDistanceInMeters;
		}else{
			max = DEFAULT_MAX_DISTANCE_IN_METERS;
		}
		dataStore.updateLastKnownLocation(user,location);
		List<User> nearbyFriends = new ArrayList<User>();
		List<User> allFriends = dataStore.getFriends(user);
		for (User friend : allFriends) {
			if (isNearby(location,friend.lastKnownLocation,max)) {
				nearbyFriends.add(friend);
			}
		}
		return nearbyFriends;
	}

	private boolean isNearby(Location loc1, Location loc2,double max) {
		double distance = LocationUtils.distInMeters(loc1.getLatitude(), loc1.getLongitude(), loc2.getLatitude(), loc2.getLongitude());
		return distance<= max;
	}

}
