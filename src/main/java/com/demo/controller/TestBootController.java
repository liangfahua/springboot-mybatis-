package com.demo.controller;

import com.demo.dto.UserDTO;
import com.demo.entity.User;
import com.demo.service.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestBootController {

    @Autowired
    private UserSevice userSevice;

    @RequestMapping("getuser")
    public User getUser() {
        User user = new User();
        user.setName("test");
        return user;
    }

    @RequestMapping("getuserByid")
    public List<User> getUser(Integer id) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(id);
        userDTO.setStart(0);
        userDTO.setPageSize(1);

        List<User> pageWithResult = userSevice.findPageWithResult(userDTO);
        return pageWithResult;
    }
}