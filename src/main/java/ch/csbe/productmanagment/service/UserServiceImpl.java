package ch.csbe.productmanagment.service;

import ch.csbe.productmanagment.model.User;
import ch.csbe.productmanagment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
// Implementation of user service for user management
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    // Create a new user (equivalent to registration without additional validation)
    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    // Update user data
    @Override
    public User update(Long id, User user) {
        User existing = getById(id);
        existing.setUsername(user.getUsername());
        existing.setPassword(user.getPassword());
        existing.setRoles(user.getRoles());
        return userRepository.save(existing);
    }

    // Delete a user by ID
    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    // Find a user by ID
    @Override
    public User getById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User with ID " + id + " not found"));
    }

    // List all users
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    // Register a new user (can add validations or password encryption here)
    @Override
    public User register(User user) {
        // Inicializa el rol por defecto si está vacío
        if (user.getRoles() == null || user.getRoles().isEmpty()) {
            user.setRoles(new HashSet<>());
            user.getRoles().add("USER");
        }
        return userRepository.save(user);
    }

    // Promote a user to ADMIN
    @Override
    public void promoteToAdmin(Long userId) {
        User user = getById(userId);
        if (!user.getRoles().contains("ADMIN")) {
            user.getRoles().add("ADMIN");
            userRepository.save(user);
        }
    }

    // Find by username
    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
