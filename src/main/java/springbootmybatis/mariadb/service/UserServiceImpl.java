package springbootmybatis.mariadb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootmybatis.mariadb.dao.UserDao;
import springbootmybatis.mariadb.domain.UserDomain;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<UserDomain> findAllUsers() {
        return userDao.getUserList();
    }

    @Override
    public UserDomain findOne(int id) {
        return userDao.findById(id);
    }
}
