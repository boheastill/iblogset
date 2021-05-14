package cn.i623.iblogset.modle.dao;

import cn.i623.iblogset.modle.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//托管类、关联属性dataSource
@Repository
public interface UserDao extends CrudRepository<User,Long> {


    //新增用户
    public void addUser(User user);

    //查询用户
    public List<User> findAll();

    public User querybyUser(String username) ;

    //更新用户
    public void updateUser(User user);

    //删除用户
    public int deleteUser(int id);
}