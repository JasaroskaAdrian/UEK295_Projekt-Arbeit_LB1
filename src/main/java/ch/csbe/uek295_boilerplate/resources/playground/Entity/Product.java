package ch.csbe.uek295_boilerplate.resources.playground.Entity;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, unique = true, nullable = false)
    private String sku;

    private boolean active;

    @Column(length = 500, nullable = false)
    private String name;

    @Column(length = 1000)
    private String image;

    @Column(columnDefinition = "MEDIUMTEXT")
    private String description;

    private float price;
    private int stock;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = true)
    private Category category;

    // Getters & Setters
}
