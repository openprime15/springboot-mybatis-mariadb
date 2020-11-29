package springbootmybatis.mariadb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springbootmybatis.mariadb.dao.UserDao;
import springbootmybatis.mariadb.domain.UserDomain;
import springbootmybatis.mariadb.service.UserService;

import java.util.List;

@RestController
public class HomeController {

    private final UserDao userDao;
    private final UserService userService;

    @Autowired
    public HomeController(UserDao testDao, UserDao userDao, UserService userService) {
        this.userDao = userDao;
        this.userService = userService;
    }


    @GetMapping("/users")
    public List<UserDomain> users() throws Exception{
        return userService.findAllUsers();
    }

    @GetMapping("/one")
    public UserDomain test(@RequestParam int id){
        return userService.findOne(id);
    }
}
