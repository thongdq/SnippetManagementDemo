package thong.dq.dao;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import thong.dq.model.User;

import java.util.Iterator;
import java.util.List;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {
    @Override
    public User findById(int id) {
        User user = getByKey(id);
//        if(user != null) {
//            Hibernate.initialize(user.getSnippets());
//        }
        return user;
    }

    @Override
    public void saveUser(User user) {
        persist(user);
    }

    @Override
    public void deleteUserBySsn(String ssn) {
        Query query = getSession().createSQLQuery("delete from snippetmanagement.public.USER where ssn = :ssn");
        query.setString("ssn", ssn);
        query.executeUpdate();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> findAllUsers() {
        Criteria criteria = createEntityCriteria();
        List<User> users = criteria.list();
        Iterator iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = (User) iterator.next();
            Hibernate.initialize(user.getSnippets());
        }
        return users;
    }

    @Override
    public User findUserBySsn(String ssn) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("ssn", ssn));
        return (User) criteria.uniqueResult();
    }
}
