package edu.self.ar.server;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ArServerServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		UserEndpoint userEndpoint = new UserEndpoint();
		User newUser = new User();
		newUser.setName(UUID.randomUUID().toString());
	//	userEndpoint.register(newUser);
		ObjectifyDatastore od = new ObjectifyDatastore();
		for(User user : od.listUsers()){
			resp.getWriter().println(user.getName());
		}
		
		
		
		
	}
}
