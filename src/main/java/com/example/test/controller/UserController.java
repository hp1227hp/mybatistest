package com.example.test.controller;

import com.example.test.dto.DataResponse;
import com.example.test.dto.UserDto;
import com.example.test.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController("/users")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("{id}")
    public DataResponse get(@PathVariable(value = "id", required = true) int id) {
        return userService.get(id);
    }

    @PostMapping
    public DataResponse create(@RequestBody UserDto userDto) {
        return userService.create(userDto);
    }

    @DeleteMapping("/{id}")
    public DataResponse delete(@PathVariable(value = "id", required = true) int id) {
        return userService.delete(id);
    }

}
