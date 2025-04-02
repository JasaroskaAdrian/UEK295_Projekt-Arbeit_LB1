package ch.csbe.productmanagment.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

/**
* User entity representing system users with authentication and authorization details
*/
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    /**
    * User roles for authorization (e.g., "ADMIN", "USER")
    * Stored in a separate collection table
    */
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"))
    private Set<String> roles;
}
