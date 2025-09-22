package emp_mais.emp_spring_boot_api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import emp_mais.emp_spring_boot_api.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Uso de propriedade aninhada: Spring Data JPA aceita existsByAccountNumber()
    boolean existsByAccountNumber(String accountNumber);
}
