package dmitri.prague.bar.bar.service;

import dmitri.prague.bar.bar.domain.Drink;
import dmitri.prague.bar.bar.domain.Order;
import dmitri.prague.bar.bar.domain.dto.OrderDto;
import dmitri.prague.bar.bar.domain.dto.OrderDtoRequest;
import dmitri.prague.bar.bar.domain.exception.CustomerAlreadyHasOrderException;
import dmitri.prague.bar.bar.repo.CustomerRepository;
import dmitri.prague.bar.bar.repo.DrinkRepository;
import dmitri.prague.bar.bar.repo.OrderRepository;
import dmitri.prague.bar.bar.transformer.OrderTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;
    private final DrinkRepository drinkRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository, CustomerRepository customerRepository, DrinkRepository drinkRepository) {
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
        this.drinkRepository = drinkRepository;
    }

    @Override
    public OrderDto getById(Integer id) {
       return OrderTransformer.toDto(orderRepository.getById(id));
    }

    @Override
    public Order create(OrderDtoRequest orderDtoRequest) {
        if (customerRepository.getById(orderDtoRequest.getCustomerId()).getOrder() != null) {
            throw new CustomerAlreadyHasOrderException(orderDtoRequest.getCustomerId());
        } else {
            Order order = new Order();
            List<Drink> drinks = new ArrayList<>();
            for (Integer drinkId : orderDtoRequest.getDrinkIds()) {
                drinks.add(drinkRepository.getById(drinkId));
            }
            order.setCustomer(customerRepository.getById(orderDtoRequest.getCustomerId()));
            order.setDrinks(drinks);
            orderRepository.save(order);

            return order;
        }
    }

}
