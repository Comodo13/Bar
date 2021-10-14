package dmitri.prague.bar.bar.service;

import dmitri.prague.bar.bar.domain.Order;
import dmitri.prague.bar.bar.domain.dto.OrderDto;
import dmitri.prague.bar.bar.domain.dto.OrderDtoRequest;


public interface OrderService {

    OrderDto getById(Integer id);
    Order create(OrderDtoRequest orderDtoRequest);
}
