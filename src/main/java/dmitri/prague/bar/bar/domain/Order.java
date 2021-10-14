package dmitri.prague.bar.bar.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="bar_orders")
public class Order {
    @Id
    @Column(name = "order_id")
    private Integer id;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            schema = "mydbtest",
            name = "order_drinks",
            joinColumns = { @JoinColumn(name = "order_id") },
            inverseJoinColumns = { @JoinColumn(name = "drink_id") }
    )
    private List<Drink> drinks = new ArrayList<>();
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Customer customer;


}
