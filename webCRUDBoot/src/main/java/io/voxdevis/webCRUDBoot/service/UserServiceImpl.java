package io.voxdevis.webCRUDBoot.service;

import io.voxdevis.webCRUDBoot.dao.UserDaoImpl;
import io.voxdevis.webCRUDBoot.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserDaoImpl userDaoImpl;

    public UserServiceImpl(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }

    @Override
        public List<User> showAll() {
        return userDaoImpl.showAll();
    }

    @Override
     public User show(int id) {
        return userDaoImpl.show(id);
    }

    @Override

    public void save(User user) {
        userDaoImpl.save(user);
    }

    @Override

    public void update(int id, User updatedUser) {
        userDaoImpl.update(id, updatedUser);

    }

    @Override

    public void delete(int id) {
        userDaoImpl.delete(id);
    }


}
