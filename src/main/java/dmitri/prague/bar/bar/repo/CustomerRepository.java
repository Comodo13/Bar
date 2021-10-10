package dmitri.prague.bar.bar.repo;

import dmitri.prague.bar.bar.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
