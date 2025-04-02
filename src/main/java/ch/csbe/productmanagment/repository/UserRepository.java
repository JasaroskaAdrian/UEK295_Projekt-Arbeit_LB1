package ch.csbe.productmanagment.repository;

import ch.csbe.productmanagment.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Database access for user entities
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
