package cn.i623.iblogset.modle.dao;

import cn.i623.iblogset.modle.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//将被注入到使用着,可以直接使用这里声明的接口
@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
    //不用写实现类,方法名影响用什么字段做查询,返回的类型为E
    List<Person> findByName(String name);
    List<Person> findByAge(Integer age);
}