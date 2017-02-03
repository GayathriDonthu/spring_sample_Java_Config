import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.repository.CustomerRepository;
import com.spring.repository.HibernateCustomerRepositoryImpl;
import com.spring.service.CustomerService;
import com.spring.service.CustomerServiceImpl;


@Configuration
public class AppConfig {
	
	@Bean(name = "customerService")
	public CustomerService getCustomerService(){
		//return new CustomerServiceImpl();
		CustomerServiceImpl service = new CustomerServiceImpl();
		service.setCustomerRepository(getCustomerRepository());
		return service;
	}
	
	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository(){
		return new HibernateCustomerRepositoryImpl();
	}
	
}
