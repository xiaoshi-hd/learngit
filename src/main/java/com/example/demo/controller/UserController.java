package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired //自动装配
    private UserRepository userRepository;

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Integer id){
        return userRepository.getById(id);
    }

    @GetMapping("/findByName/{name}")
    public User findById(@PathVariable("name") String name){
        System.out.println(name);
        return userRepository.getByName(name);
    }

    @PostMapping("/save")
    public User save(@RequestBody User user){
        return userRepository.save(user);
    }

    @PutMapping("/put")
    public User update(@RequestBody User user){
        //save 方法同时具有添加和更新的功能
        return userRepository.save(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") Integer id){
        userRepository.deleteById(id);
        return "删除数据成功！";
    }

    //这里测试以下议案
}
