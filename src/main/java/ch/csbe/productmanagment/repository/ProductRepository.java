package ch.csbe.productmanagment.repository;

import ch.csbe.productmanagment.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// Database access for product entities
public interface ProductRepository extends JpaRepository<Product, Long> {
}
