package ch.csbe.uek295_boilerplate.resources.playground.Repository;

import ch.csbe.uek295_boilerplate.resources.playground.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
