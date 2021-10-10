package dmitri.prague.bar.bar.transformer;

import dmitri.prague.bar.bar.domain.Customer;
import dmitri.prague.bar.bar.domain.dto.CustomerDto;

public class CustomerTransformer {
    public static CustomerDto toDto (Customer customer){
        CustomerDto customerDto = new CustomerDto();
        customerDto.setCustomerName(customer.getCustomerName());
        customerDto.setId(customer.getId());
        customerDto.setAdult(customer.isAdult());

        return customerDto;
    }
}
