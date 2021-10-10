package dmitri.prague.bar.bar.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.HashSet;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="bar_drinks")

public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "drink_id")
    private Integer id;
    @Column(name = "drink_name")
    private String drinkName;
    @Column(name = "drink_price")
    private Integer price;
    @Column(name = "is_for_adult")
    private boolean isForAdult;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            schema = "mydbtest",
            name = "order_drinks",
            joinColumns = { @JoinColumn(name = "drink_id") },
            inverseJoinColumns = { @JoinColumn(name = "order_id") }
    )
    private Set<Order> orders = new HashSet<>();
}
