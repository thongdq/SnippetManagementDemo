package thong.dq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import thong.dq.dao.UserDao;
import thong.dq.model.User;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(int id) {
        return userDao.findById(id);
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        User userEntity = userDao.findById(user.getId());
        if(userEntity != null) {
            userEntity.setName(user.getName());
            userEntity.setJoiningDate(user.getJoiningDate());
        }
    }

    @Override
    public void deleteUserBySsn(String ssn) {
        userDao.deleteUserBySsn(ssn);
    }

    @Override
    public List<User> findAllUsers() {
        return userDao.findAllUsers();
    }

    @Override
    public User findUserBySsn(String ssn) {
        return userDao.findUserBySsn(ssn);
    }

}
