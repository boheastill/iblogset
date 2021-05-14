package cn.i623.iblogset.modle.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User implements Serializable {
    //增加实体,表会自动建立,加字段,会自动加,注释字段,表不会删除字段,
    //IDEA操作的数据库与应用数据库会干扰,表结构变更后,俩个都关,刷新IDEA表结构,看到变更,关DIEA,开应用
    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    private String name;

    private String password;

    private Integer score;

    private Date creattime;


}