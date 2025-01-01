package vn.hoidanit.laptopshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.hoidanit.laptopshop.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User hansoo);

    List<User> findByEmailAndAddress(String email, String address);

    List<User> findAll();

    User getUserById(long id);

    void deleteById(long id);
}
