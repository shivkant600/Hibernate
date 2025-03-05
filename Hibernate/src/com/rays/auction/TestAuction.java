package com.rays.auction;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestAuction {
	
	public static void main(String[] args) {

		Bid bid1 = new Bid();
		//bid1.setId(1);
		bid1.setAmount(1000);
		bid1.setTimeStamp("c");

		Bid bid2 = new Bid();
	//	bid2.setId(2);
		bid2.setAmount(8000);
		bid2.setTimeStamp("cc");

		Bid bid3 = new Bid();
	//	bid3.setId(3);
		bid3.setAmount(4000);
		bid3.setTimeStamp("ccc");
		
		//Bid bid4 = new Bid();
	//	bid4.setId(4);
	//	bid4.setAmount(5000);
	//	bid4.setTimeStamp("bbbb");

		Set bids = new HashSet();

		bids.add(bid1);
		bids.add(bid2);
		bids.add(bid3);
		//bids.add(bid4);

		AuctionItem item = new AuctionItem();
//		item.setId(2);
		item.setDescription(" car ");
		item.setBids(bids);

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(item);

		tx.commit();

		session.close();
	}
	
	

}
