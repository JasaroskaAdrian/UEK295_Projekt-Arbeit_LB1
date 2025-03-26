package ch.csbe.uek295_boilerplate.resources.playground.Repository;


import ch.csbe.uek295_boilerplate.resources.playground.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
