package com.rating.rest;

import com.rating.domain.User;

import java.io.UnsupportedEncodingException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;

@Path("/session")
public class SessionResource extends BaseResource {

	@Context
	HttpServletRequest request;

	@POST
	@Produces("application/json")
	@Path("/login")
	public User Login(@FormParam("username") String username, @FormParam("password") String password)
			throws NamingException, UnsupportedEncodingException {

		HttpSession s = request.getSession();
		if (s != null) {
			s.invalidate();
		}

		User usr = LDAP_Entry.findUser(username, password);

		if (usr != null) {
			s = request.getSession(true);

			s.setAttribute("token", usr.getToken());
			s.setAttribute("user", usr);

			token2session.put(usr.getToken().toString(), s);
		}

		return usr;
	}

	@POST
	@Produces("application/json")
	@Path("/logout")
	public boolean Logout(@HeaderParam("token") String token) {

		token2session.remove(token);

		return true;
	}

}
