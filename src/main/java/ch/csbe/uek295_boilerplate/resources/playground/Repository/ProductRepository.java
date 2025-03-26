package ch.csbe.uek295_boilerplate.resources.playground.Repository;


import ch.csbe.uek295_boilerplate.resources.playground.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
