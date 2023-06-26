package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    void removeUser(long id);
    void editUser(User user);
    User getUserById(long id);
}
