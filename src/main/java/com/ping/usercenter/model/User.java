package com.ping.usercenter.model;

import lombok.Data;

@Data
//@TableName("`user`")
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}