package com.lukenation.personal.balance.repository;

import com.lukenation.personal.balance.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
