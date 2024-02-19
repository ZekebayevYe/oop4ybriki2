package com.example.oopaer.services.interfaces;
import com.example.oopaer.models.User;

import java.util.List;

public interface UserServiceInterface {
    List<User> getAll();
    User getById(int id);
    User create(User user);
    List<User> getByLogin(String login);
}