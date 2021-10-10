package dmitri.prague.bar.bar.domain.dto;

import lombok.Data;

@Data
public class CustomerDto {

    private Integer id;
    private String customerName;
    private boolean isAdult;

}
