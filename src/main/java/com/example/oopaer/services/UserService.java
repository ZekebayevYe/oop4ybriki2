package com.example.oopaer.services;

import com.example.oopaer.models.User;
import com.example.oopaer.repositories.UserRepositoryInterface;
import com.example.oopaer.services.interfaces.UserServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService implements UserServiceInterface {

    private final UserRepositoryInterface repo;

    public UserService(UserRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<User> getAll() {
        return repo.findAll();
    }

    @Override
    public User getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public User create(User user) {
        return repo.save(user);
    }

    @Override
    public List<User> getByLogin(String login) {
        return repo.findByLogin(login);
    }
}