package dmitri.prague.bar.bar.service;

import dmitri.prague.bar.bar.domain.dto.OrderDto;
import dmitri.prague.bar.bar.repo.OrderRepository;

import java.util.List;

public interface OrderService {

    List<OrderDto> getAllOrdersMappedByCustomer(Integer id);
    OrderDto getById(Integer id);
}
