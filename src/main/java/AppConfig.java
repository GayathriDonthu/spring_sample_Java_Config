import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.repository.CustomerRepository;
import com.spring.repository.HibernateCustomerRepositoryImpl;
import com.spring.service.CustomerService;
import com.spring.service.CustomerServiceImpl;


@Configuration
@ComponentScan({"com.spring"})
public class AppConfig {
	
	
	/* code  using constructor injection */
	/*
	@Bean(name = "customerService")
	public CustomerService getCustomerService(){
		//return new CustomerServiceImpl();
		CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		//service.setCustomerRepository(getCustomerRepository());
		return service;
	} 
	*/ 
	
	
	/*// code for Autowired, using setter injection
	@Bean(name = "customerService")
	public CustomerService getCustomerService(){
		//return new CustomerServiceImpl();
		//CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		CustomerServiceImpl service = new CustomerServiceImpl();
		service.setCustomerRepository(getCustomerRepository());
		return service;
	}*/
	
	/*commenting all beans for stereotype annotations @Service
	// code for Autowired configuration
	@Bean(name = "customerService")
	public CustomerService getCustomerService(){
		CustomerServiceImpl service = new CustomerServiceImpl();
		return service;
	}*/
	/*commenting for stereotype annotations @Repository
	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository(){
		return new HibernateCustomerRepositoryImpl();
	}
	*/
}
 