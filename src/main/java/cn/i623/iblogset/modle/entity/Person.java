package cn.i623.iblogset.modle.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

//默认lombok三注释
@Data
@AllArgsConstructor
@NoArgsConstructor
//声明是一个JPA实体
@Entity
//会在数据库创建/更新(并保存数据表)
@Table(name = "person")
public class Person implements Serializable {
    //表示ID策略
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    //字段,会对应数据库
    private String name;
    private Integer age;
    private String address;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

}