package springbootmybatis.mariadb.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import springbootmybatis.mariadb.domain.UserDomain;

import java.util.List;

@Repository
public class UserDao {

    private final SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    public UserDao(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public List<UserDomain> getUserList(){
        return sqlSessionTemplate.selectList("selectUsers");
    }

    public UserDomain findById(int id){
        return sqlSessionTemplate.selectOne("selectUserOne", id);
    }


}
