package co.com.cloud.movies.serviceuser.services;

import co.com.cloud.movies.serviceuser.entities.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void delete(User user);
    List<User> findAll();
    User findById(Long id);
}
