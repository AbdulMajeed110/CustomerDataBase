package com.CustomerDataBase.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.CustomerDataBase.Entity.CustomerEntity;
import com.CustomerDataBase.Services.CustomerServices;

//@Controller
//public class CustomerController {
//	
//	@RequestMapping(value ="/books",method = RequestMethod.GET)
//	@ResponseBody
//	public String getBooks(){
//		
//		return "This is Spring Boot Project";
//		}
//
//}

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerServices customerServices;

//	@GetMapping("/books")
//	public CustomerEntity getBooks() {
//		
//		CustomerEntity customer = new CustomerEntity();
//  	customer.setCust_Name("Ajaz");
//  	customer.setCust_Id(1);
//  	customer.setCust_AC_Title("Current");
//		
//		customer.setCust_Name("Ayaz");
//		customer.setCust_Id(2);
//		customer.setCust_AC_Title("Saveing");
//		System.out.println("Set Details"+customer);
//
//		return customer;
//	}
	@GetMapping("/books")
	public List<CustomerEntity> getBooks() {

		return this.customerServices.getAllBooks();
	}
	
	@GetMapping("/books/{id}")
	public CustomerEntity getBook(@PathVariable("id") int id) {
		return customerServices.getBookById(id);
	}
	
	@PostMapping("/books")
	public CustomerEntity AddBook(@RequestBody CustomerEntity book) {
		CustomerEntity b = this.customerServices.AddBook(book);
		return book;
	}

}
