package vn.hoidanit.laptopshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String handleHello() {
        return "Hello from Service";
    }

    public User handleSaveUser(User user) {
        User hansoo = this.userRepository.save(user);
        System.out.println("hansoo: " + hansoo);
        return hansoo;
    }

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public List<User> getAllUsersByEmail(String email) {
        return this.userRepository.findAll();
    }

    public User getUserById(long id) {
        return this.userRepository.getUserById(id);
    }

    public void deleteUser(long id) {
        this.userRepository.deleteById(id);
    }
}
