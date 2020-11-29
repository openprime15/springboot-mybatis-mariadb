package springbootmybatis.mariadb.service;

import springbootmybatis.mariadb.domain.UserDomain;

import java.util.List;

public interface UserService {

    List<UserDomain> findAllUsers();

    UserDomain findOne(int id);


}
