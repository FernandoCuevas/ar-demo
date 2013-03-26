package edu.self.ar.server;

import java.util.ArrayList;
import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;

@Api(name = "arserver")
public class UserEndpoint {

	private final double DEFAULT_MAX_DISTANCE_IN_METERS = 100;
	private IDatastore datastore = new ObjectifyDatastore();
	
	@ApiMethod(name = "user.register", httpMethod = "POST")
	public void register(User newUser){
		if(!datastore.exists(newUser)){
			datastore.add(newUser);
		}else{
			//handle existing user.
		}
		//return null;
		
	}
	
//	@ApiMethod(name = "user.updatefriends", httpMethod = "POST")
//	public void updateFriends(List<String> phoneList){
//			
//	}
	
	
//	@ApiMethod(name = "user.getnearbyfriends", httpMethod = "GET")
//	public User getNearbyFriends(User user, Location location,double maxDistanceInMeters) {
//		double max;
//		if(maxDistanceInMeters>0){
//			max = maxDistanceInMeters;
//		}else{
//			max = DEFAULT_MAX_DISTANCE_IN_METERS;
//		}
//		datastore.updateLastKnownLocation(user,location);
//		List<User> nearbyFriends = new ArrayList<User>();
//		List<User> allFriends = datastore.getFriends(user);
//		for (User friend : allFriends) {
//			if (isNearby(location,friend.lastKnownLocation,max)) {
//				nearbyFriends.add(friend);
//			}
//		}
//		//return nearbyFriends;
//		return null;
//	}

	private boolean isNearby(Location loc1, Location loc2,double max) {
		double distance = LocationUtils.distInMeters(loc1.getLatitude(), loc1.getLongitude(), loc2.getLatitude(), loc2.getLongitude());
		return distance<= max;
	}

}
