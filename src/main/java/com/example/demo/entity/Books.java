package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

//Lombok简化实体类的编写
@Data
//表示这是跟表关联的实体类，类名要跟表名一致（不区分大小写）
@Entity
public class Books {
    //表绑定起来之后，再将字段绑定起来
    @Id
    //属性自增
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
//    @Column
    private String name;
//    @Column
    private String author;

    //Lombok是不用写get，set方法的
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
