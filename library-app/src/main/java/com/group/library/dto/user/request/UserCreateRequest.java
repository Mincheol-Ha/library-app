package com.group.library.dto.user.request;

public class UserCreateRequest {
    private String name;
    private Integer age;

    public UserCreateRequest() {
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
}
