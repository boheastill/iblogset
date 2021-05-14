package cn.i623.iblogset.controller;

import cn.i623.iblogset.modle.entity.Person;
import cn.i623.iblogset.modle.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/person")
public class PersonController {
    //依赖注入
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(value = "/hello")
    public String hello(){
        return "Hello!";
    }

    @RequestMapping(value = "/save")
    public Person savePerson(String name, String address, Integer age){
        return personRepository.save(new Person(null,name,age,address));
    }

    @RequestMapping(value = "/findByName")
    public List<Person> findByName(String name){
        return personRepository.findByName(name);
    }
    // findByAge是网址
    @RequestMapping(value = "/findByAge")
    //参数类型要匹配
    public List<Person> findByAge(Integer age){
        //调用dao接口
        return personRepository.findByAge(age);
    }
}