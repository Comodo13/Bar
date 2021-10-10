package dmitri.prague.bar.bar.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="bar_customers")

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private Integer id;
    @Column(name="customer_name")
    private String customerName;
    @Column(name="customer_money")
    private Integer money;
    @Column(name="is_adult")
    private boolean isAdult;
    @OneToOne
    private Order order;
}

