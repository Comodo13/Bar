package dmitri.prague.bar.bar.service;

import dmitri.prague.bar.bar.domain.dto.OrderDto;
import dmitri.prague.bar.bar.repo.OrderRepository;
import dmitri.prague.bar.bar.transformer.OrderTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<OrderDto> getAllOrdersMappedByCustomer(Integer id) {
        orderRepository.findAll();
        return null;
    }

    @Override
    public OrderDto getById(Integer id) {
       return OrderTransformer.toDto(orderRepository.getById(id));
    }
}
