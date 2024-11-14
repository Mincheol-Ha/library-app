package com.group.library.dto.user.request;

public class UserUpdateRequest {
    private long id;
    private String name;

    public UserUpdateRequest() {
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
