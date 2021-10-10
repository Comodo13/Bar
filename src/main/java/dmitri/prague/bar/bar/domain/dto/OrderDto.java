package dmitri.prague.bar.bar.domain.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderDto {
    private Integer id;
    private String customerName;
    private Integer price;
    private List<String> drinks;
}
