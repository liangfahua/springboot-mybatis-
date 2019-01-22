package com.demo.service.impl;

import com.demo.dto.UserDTO;
import com.demo.entity.User;
import com.demo.mapper.UserMapper;
import com.demo.service.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserSevice {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int insertSelective(User user) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(User user) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User user) {
        return 0;
    }

    @Override
    public User selectById(Integer id) {
        return null;
    }

    @Override
    public List<User> findPageWithResult(UserDTO userDTO) {
        return userMapper.findPageWithResult(userDTO);
    }

    @Override
    public Integer findPageWithCount(UserDTO userDTO) {
        return userMapper.findPageWithCount(userDTO);
    }
}
