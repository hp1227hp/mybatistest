package com.example.test.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserDto {

    private int id;

    private String name;

    private int age;

}
