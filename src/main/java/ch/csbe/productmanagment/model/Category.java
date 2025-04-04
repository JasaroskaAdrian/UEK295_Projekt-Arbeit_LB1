package ch.csbe.productmanagment.model;

import jakarta.persistence.*;
import lombok.Data;

/**
* Category entity for grouping related products
*/
@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
}
