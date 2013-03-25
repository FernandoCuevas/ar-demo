package edu.self.ar.server;

import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;

@Api(name = "ar-server")
public class UserEndpoint {

	private IDatastore datastore = new ObjectifyDatastore();
	
	@ApiMethod(name = "user.register", httpMethod = "POST")
	public void register(User newUser){
		if(!datastore.exists(newUser)){
			datastore.add(newUser);
		}else{
			//handle existing user.
		}
		
		
	}
	
	@ApiMethod(name = "user.updatefriends", httpMethod = "POST")
	public void updateFriends(List<String> phoneList){
			
	}

}
