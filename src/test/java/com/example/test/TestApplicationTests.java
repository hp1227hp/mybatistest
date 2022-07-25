package com.example.test;

import com.example.test.dto.DataResponse;
import com.example.test.dto.UserDto;
import com.example.test.entity.User;
import com.example.test.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class TestApplicationTests {

    @Resource
    private UserService userService;

    @Test
    void contextLoads() {
    }

    @Test
    public void test() {
        UserDto userDto = UserDto.builder().age(22).name("王五").build();
        System.out.println(userService.create(userDto).getData());
        System.out.println("---------------");
        System.out.println(userDto.getId());

    }

    @Test
    public void test2() {
        userService.delete(1);
    }

    @Test
    public void test3() {
        DataResponse dataResponse = userService.get(1);
        System.out.println(dataResponse.getData());
    }

    @Test
    public void test4() {
        User user = User.builder().age(20).name("hp").build();
        userService.create2(user);
        System.out.println("0000000000000000000000");
        System.out.println(user.getId());
    }

}
