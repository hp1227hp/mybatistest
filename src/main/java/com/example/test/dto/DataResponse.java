package com.example.test.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DataResponse<T> {

    private String code;

    private String info;

    private T data;

}
