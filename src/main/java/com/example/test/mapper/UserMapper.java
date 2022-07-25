package com.example.test.mapper;

import com.example.test.dto.UserDto;
import com.example.test.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    int delete(@Param("id") int id);

    int create(User user);

    int create2(User user);

    @Select("select id, `name`, age from t_user where id = #{id} ")
    UserDto get(@Param("id") int id);

}
