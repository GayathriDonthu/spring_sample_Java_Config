package com.spring.repository;

import java.util.ArrayList;
import java.util.List;

import com.spring.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.spring.repository.CustomerRepository#findAll()
	 */
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Gayathri");
		customer.setLastName("Guttikonda");
		
		customers.add(customer);
		
		return customers;
	}
	
	
}
