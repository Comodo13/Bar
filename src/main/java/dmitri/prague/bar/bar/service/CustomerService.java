package dmitri.prague.bar.bar.service;

import dmitri.prague.bar.bar.domain.dto.CustomerDto;
import dmitri.prague.bar.bar.domain.dto.OrderDto;

import java.util.List;

public interface CustomerService {

    List<CustomerDto> getAllCustomers();
    CustomerDto getCustomerById(Integer id);
    List<OrderDto> getAll();

}
