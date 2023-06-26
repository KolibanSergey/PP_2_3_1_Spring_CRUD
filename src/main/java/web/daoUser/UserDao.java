package web.daoUser;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void addUser(User user);
    void removeUser(long id);
    void editUser(User user);
    User getUserById(long id);

}
