package thong.dq.dao;

import thong.dq.model.User;

import java.util.List;

public interface UserDao {

    User findById(int id);

    void saveUser(User user);

    void deleteUserBySsn(String ssn);

    List<User> findAllUsers();

    User findUserBySsn(String ssn);

}
