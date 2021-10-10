package dmitri.prague.bar.bar.repo;

import dmitri.prague.bar.bar.domain.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepository extends JpaRepository<Drink,Integer> {
}
