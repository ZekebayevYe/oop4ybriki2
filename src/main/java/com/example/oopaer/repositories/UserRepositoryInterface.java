package com.example.oopaer.repositories;

import com.example.oopaer.models.Ticket;
import com.example.oopaer.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface UserRepositoryInterface extends JpaRepository<User, Ticket> {
    List<User> findBySurname(String surname);
}