package org.Block.Blockard;


	
	import org.models.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
	import javax.ws.rs.Produces;
	import javax.ws.rs.core.MediaType;

	import org.models.User_Master;

	@Path("login")
	public class LogIN {
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public Login getMeassages()
		{	Login l=new Login("shri2301","m",(long)143,(long)1);
			User_Master u=new User_Master((long)1,"Shriram","","Jeyanthi",(long)96770243,"Chennai");
			return l;
		}
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public User_Master getCredentials(logon lg)
		{	Login l=new Login("shri2301","s",(long)143,(long)1);
			
			User_Master u=new User_Master((long)1,"Shriram","","Ramanujam",(long)96770243,"Chennai");
			User_Master v=new User_Master((long)2,"","","",(long)0,"");
			if((lg.getPassword().equals(l.getPassword()))&&(lg.getUsername().equals(l.getUsername())))
			{
			return u;
			}
			else
			{
				return v;
			}
		}

	}


