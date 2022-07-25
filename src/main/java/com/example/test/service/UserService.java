package com.example.test.service;

import com.example.test.dto.DataResponse;
import com.example.test.dto.UserDto;
import com.example.test.entity.User;

public interface UserService {

    DataResponse delete(int id);

    DataResponse create(UserDto userDto);

    DataResponse get(int id);

    void create2(User user);

}
