package com.spring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.model.Customer;

@Repository("customerRepository") // adding for stereotype annotation
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
