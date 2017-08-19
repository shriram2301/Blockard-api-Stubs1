package org.Block.Blockard;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.models.Card;

@Path("unblock")
public class unBlock {


	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Card unblockCard(Card c)
	{
		if(c.isActive_status()==false)
		{
			c.setActive_status(true);
			return c;
		}
		else
		{
			return c;
		}
	}
}
