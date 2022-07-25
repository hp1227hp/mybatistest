package com.example.test.entity;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class User {

    private int id;

    private String name;

    private int age;

}
