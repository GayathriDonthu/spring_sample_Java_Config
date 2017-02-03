package com.spring.service;

import java.util.List;

import com.spring.model.Customer;
import com.spring.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}


	/* (non-Javadoc)
	 * @see com.spring.service.CustomerService#findAll()
	 */
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
}
