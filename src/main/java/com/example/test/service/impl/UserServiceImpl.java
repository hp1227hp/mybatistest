package com.example.test.service.impl;

import com.example.test.dto.DataResponse;
import com.example.test.dto.UserDto;
import com.example.test.entity.User;
import com.example.test.mapper.UserMapper;
import com.example.test.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public DataResponse delete(int id) {
        userMapper.delete(id);
        return null;
    }

    @Override
    public DataResponse create(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        int i = userMapper.create(user);
        System.out.println(user.getId());
        return DataResponse.builder().data(i).build();
    }

    @Override
    public DataResponse get(int id) {
        UserDto userDto = userMapper.get(id);
        return DataResponse.builder().data(userDto).build();
    }

    @Override
    public void create2(User user) {
        userMapper.create2(user);
    }

}
