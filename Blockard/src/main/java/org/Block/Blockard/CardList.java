package org.Block.Blockard;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.models.*;

@Path("cards")
public class CardList {
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Card> getCards1()
	{   Card c1=new Card("1212121212121212",(long)1,"debit",true,(float)1221332.32);
	Card c2=new Card("121212121232",(long)1,"credit",true,(float)1234.3);
		List<Card> cards= new ArrayList<Card>();
		cards.add(c1);
		cards.add(c2);
		return cards;
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Card> getCards(User_Master u)
	{   Card c1=new Card("1212121212121212",(long)1,"debit",true,(float)1221332.32);
	Card c2=new Card("121212121232",(long)1,"credit",true,(float)1234.3);
	List<Card> cards= new ArrayList<Card>();
	cards.add(c1);
	cards.add(c2);
	return cards;	
	}

}
