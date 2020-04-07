package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {

    }

    /**
     * 在这里测试一下是否能获取到数据库内容
     */
    @Test
    public void testMysql() {
        List<Map<String,Object>> result = jdbcTemplate.queryForList("select * from books");
        System.out.println("query result is" + result.size());
        System.out.println("success");
    }
}
