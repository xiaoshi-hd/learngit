package com.example.demo.repository;

import com.example.demo.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

//这里只要传入两个泛型，第一个是实体类，第二个是主键对应的类型
public interface BookRepository extends JpaRepository<Books, Integer> {
//这里不用写任何方法，基本的增删改查已经实现
}
