package org.Block.Blockard;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.models.*;

@Path("block")
public class Block {


	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Card blockCard(Card c)
	{
		if(c.isActive_status()==true)
		{
			c.setActive_status(false);
			return c;
		}
		else
		{
			return c;
		}
	}
}
