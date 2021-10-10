package dmitri.prague.bar.bar.transformer;

import dmitri.prague.bar.bar.domain.Order;
import dmitri.prague.bar.bar.domain.dto.OrderDto;

import java.util.stream.Collectors;

public class OrderTransformer {
    public static OrderDto toDto(Order order){

        OrderDto dto = new OrderDto();
        dto.setId(order.getId());
        dto.setPrice(order.getDrinks().stream().map(x->x.getPrice()).reduce(0, Integer::sum));
        dto.setCustomerName(order.getCustomer().getCustomerName());
        dto.setDrinks(order.getDrinks().stream().map(x->x.getDrinkName()).collect(Collectors.toList()));
        return dto;
    }
}
