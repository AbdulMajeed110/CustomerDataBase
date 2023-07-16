package com.CustomerDataBase.Services;


import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Component;

import com.CustomerDataBase.Entity.CustomerEntity;

@Component
public class CustomerServices 
{
	
	private static List<CustomerEntity> list = new ArrayList<>();
	
	static {
		list.add(new CustomerEntity(12,"Sajjad Mari","Student"));
		list.add(new CustomerEntity(13,"Sajjan Mari","Student"));
		list.add(new CustomerEntity(14,"Sajid Mari","Student"));
	}
	
	
	public List<CustomerEntity> getAllBooks(){
		return list;
	}
	
	public CustomerEntity getBookById(int id) {
		CustomerEntity book=null;
		book = list.stream().filter(e->e.getId()==id).findFirst().get();
		return book;
	}
	
	public CustomerEntity AddBook(CustomerEntity e) {
		list.add(e);
		return e;
	}

}
