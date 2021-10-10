package dmitri.prague.bar.bar.controller;


import dmitri.prague.bar.bar.domain.dto.OrderDto;
import dmitri.prague.bar.bar.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("bar/orders/")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity createOrder() {
        return null;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<OrderDto> getOrderById(@PathVariable Integer id) {
       return new ResponseEntity<>(orderService.getById(id), HttpStatus.OK) ;
    }
}
