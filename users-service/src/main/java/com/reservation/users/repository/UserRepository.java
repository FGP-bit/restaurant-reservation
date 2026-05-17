package com.reservation.users.repository;

import com.reservation.users.entity.User;
import org.springframework.data.jpa.repositoru.Jpa.Repository;
import java.util.Optional;

public interface UserRepositoru extends JpaRepository<User, Long>{
    Optional <User> findByEmail(String email);

    boolean existsByEmail(String email);

}