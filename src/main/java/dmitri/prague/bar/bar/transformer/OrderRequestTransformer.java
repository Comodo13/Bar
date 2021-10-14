package dmitri.prague.bar.bar.transformer;

import dmitri.prague.bar.bar.domain.Order;
import dmitri.prague.bar.bar.domain.dto.OrderDtoRequest;
import org.aspectj.weaver.ast.Or;

import java.util.stream.Collectors;


public class OrderRequestTransformer {

    public static OrderDtoRequest toOrderDtoRequest(Order order) {
        OrderDtoRequest orderDtoResponse = new OrderDtoRequest();
        orderDtoResponse.setCustomerId(order.getCustomer().getId());
        orderDtoResponse.setDrinkIds(order.getDrinks().stream().map(x->x.getId()).collect(Collectors.toList()));
        return  orderDtoResponse;
    }

}
