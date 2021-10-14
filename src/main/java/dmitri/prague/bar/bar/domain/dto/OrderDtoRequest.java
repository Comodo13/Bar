package dmitri.prague.bar.bar.domain.dto;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class OrderDtoRequest {
    private Integer customerId;
    private List<Integer> drinkIds = new ArrayList<>();
}
