package dmitri.prague.bar.bar.service;

import dmitri.prague.bar.bar.domain.Customer;
import dmitri.prague.bar.bar.domain.dto.CustomerDto;
import dmitri.prague.bar.bar.domain.dto.OrderDto;
import dmitri.prague.bar.bar.repo.CustomerRepository;
import dmitri.prague.bar.bar.transformer.CustomerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        List<Customer> customers =customerRepository.findAll();
        return customers.stream().map(CustomerTransformer::toDto).collect(Collectors.toList());
    }

    @Override
    public CustomerDto getCustomerById(Integer id) {
        return CustomerTransformer.toDto(customerRepository.getById(id));
    }

    @Override
    public List<OrderDto> getAll() {
        return null;
    }


}
