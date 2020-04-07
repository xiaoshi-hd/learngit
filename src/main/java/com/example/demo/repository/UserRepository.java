package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    //自定义的方法也不用去实现，但是函数名一定要规范
    public User getById(Integer id);
    public User getByName(String name);
}
