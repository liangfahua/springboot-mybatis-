package com.demo.service.impl;

import com.demo.entity.User;
import com.demo.mapper.UserMapper;
import com.demo.service.UserSevice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserSevice userSevice;

    @Autowired
    private UserMapper userMapper;



    @Test
    public void contextLoads() {
        User user = new User();
        user.setName("bb");
        int i = userSevice.insert(user);
        System.out.println(i);

    }
}