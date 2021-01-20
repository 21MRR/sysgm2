package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Seller;

public class SellerService {
	
	public List<Seller> findAll(){
		List<Seller> list = new ArrayList<>();
		list.add(new Seller(1,"Rezende","34.369-2"));
		list.add(new Seller(2,"Mario","111.300-2"));
		list.add(new Seller(3,"Ana Paula","34.409-1"));
		list.add(new Seller(4,"Renato César","105.345-0"));
		return list;
	}

}
