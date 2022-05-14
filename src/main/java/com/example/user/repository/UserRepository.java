package com.example.user.repository;

import com.example.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM users", nativeQuery = true)
    List<User> findAll();
    @Query(value = "SELECT * FROM users u WHERE u.id = :id", nativeQuery = true)
    User getById(@Param("id") Integer id);
    @Query(value = "SELECT * FROM users u WHERE u.login = :login", nativeQuery = true)
    User findByLogin(@Param("login") String login);
    @Query(value = "SELECT * FROM users u WHERE u.email = :email", nativeQuery = true)
    User findByEmail(@Param("email") String email);
}
