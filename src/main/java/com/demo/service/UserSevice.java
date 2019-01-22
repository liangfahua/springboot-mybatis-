package com.demo.service;

import com.demo.dto.UserDTO;
import com.demo.entity.User;

import java.util.List;

public interface UserSevice {
    int deleteByPrimaryKey(Integer id);

    int insert(User user);

    int insertSelective(User user);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User user);

    User selectById(Integer id);

    List<User> findPageWithResult(UserDTO userDTO);

    Integer findPageWithCount(UserDTO userDTO);
}
