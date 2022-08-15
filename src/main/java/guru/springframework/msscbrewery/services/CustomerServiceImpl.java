package guru.springframework.msscbrewery.services;

import java.util.UUID;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID customerId) {

		return CustomerDto.builder().id(UUID.randomUUID())
				.name("customer random name")
				.build();
	}

	@Override
	public CustomerDto saveNewCustomer(CustomerDto customerDto) {
		// TODO Auto-generated method stub
		return CustomerDto.builder().id(UUID.randomUUID())
				.name("customer nam")
				.build();
	}

	@Override
	public void updatecustomer(UUID customerId, CustomerDto customerDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(UUID customerId) {
		// TODO Auto-generated method stub
		log.debug("deleting a customer....");
	}

}
