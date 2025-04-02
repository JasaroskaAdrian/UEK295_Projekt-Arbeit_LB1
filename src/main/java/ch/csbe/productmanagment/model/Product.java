package ch.csbe.productmanagment.model;

import jakarta.persistence.*;
import lombok.Data;

/**
* Product entity representing items available in the product catalog
*/
@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;
    private double price;

    /**
    * Many-to-one relationship with Category
    * Multiple products can belong to a single category
    */
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
