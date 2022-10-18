package io.voxdevis.webCRUDBoot.dao;

import io.voxdevis.webCRUDBoot.model.User;


import java.util.List;

public interface UserDao {

    List<User> showAll();

    User show(int id);

    void save(User user);

    void update(int id, User updatedUser);

    void delete(int id);
}
