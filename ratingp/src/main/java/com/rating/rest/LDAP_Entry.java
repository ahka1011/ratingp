package com.rating.rest;

import javax.naming.directory.*;

import com.rating.domain.Pwd;
import com.rating.domain.Token;
import com.rating.domain.User;

import javax.naming.*;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Hashtable;

public class LDAP_Entry {

	public static User findUser(String username, String password) {

		try {
			String icf = "com.sun.jndi.ldap.LdapCtxFactory";
			String url = "ldap://ads.hs-karlsruhe.de:389";

			String s_p = "CN=kubu1011,OU=_sg_WIB,OU=_fk_IWI,OU=HS Studenten,OU=HS Users,OU=HS,DC=ads,DC=hs-karlsruhe,DC=de";

			Pwd pw = new Pwd();
			byte[] decoded = Base64.getDecoder().decode(pw.getPwd());
			String pwd = new String(decoded, "UTF-8");

			Hashtable<String, String> env1 = new Hashtable<String, String>();
			env1.put(Context.INITIAL_CONTEXT_FACTORY, icf);
			env1.put(Context.PROVIDER_URL, url);
			env1.put(Context.SECURITY_AUTHENTICATION, "simple");
			env1.put(Context.SECURITY_PRINCIPAL, s_p);
			env1.put(Context.SECURITY_CREDENTIALS, pwd);

			DirContext ctx = new InitialDirContext(env1);

			String filter = "(cn=" + username + ")";
			SearchControls ctrl = new SearchControls();
			ctrl.setSearchScope(SearchControls.SUBTREE_SCOPE);
			NamingEnumeration<SearchResult> answer = ctx.search("DC=ads,DC=hs-karlsruhe,DC=de", filter, ctrl);

			String dn;

			if (answer.hasMore()) {
				SearchResult result = (SearchResult) answer.next();
				dn = result.getNameInNamespace().toString();

				try {
					Hashtable<String, String> env2 = new Hashtable<String, String>();
					env2.put(Context.INITIAL_CONTEXT_FACTORY, icf);
					env2.put(Context.PROVIDER_URL, url);
					env2.put(Context.SECURITY_AUTHENTICATION, "simple");
					env2.put(Context.SECURITY_PRINCIPAL, dn);
					env2.put(Context.SECURITY_CREDENTIALS, password);

					DirContext context = new InitialDirContext(env2);

					Attributes attr = context.getAttributes(dn);

					String role;

					if (dn.contains("HS_Mitarbeiter")) {
						role = User.PROFESSOR;
					} else {
						role = User.STUDENT;
					}
					Token token = new Token(role);

					User user = new User("" + attr.get("sn").get(), "" + attr.get("givenName").get(),
							"" + attr.get("mail").get(), "" + attr.get("cn").get(), role, token);

					return user;

				} catch (Exception e) {
					throw e;
				}

			} else {
				dn = null;
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
