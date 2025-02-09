package com.group.library.service.user;

import java.util.List;

import org.springframework.stereotype.Service;

import com.group.library.dto.user.request.UserCreateRequest;
import com.group.library.dto.user.request.UserUpdateRequest;
import com.group.library.dto.user.response.UserResponse;
import com.group.library.repository.user.UserJdbcRepository;

@Service
public class UserServiceV1 {

  private final UserJdbcRepository userJdbcRepository;

  public UserServiceV1(UserJdbcRepository userJdbcRepository) {
    this.userJdbcRepository = userJdbcRepository;
  }

  public void saveUser(UserCreateRequest request) {
    userJdbcRepository.saveUser(request.getName(), request.getAge());
  }

  public List<UserResponse> getUsers() {
    return userJdbcRepository.getUsers();
  }

  public void updateUser(UserUpdateRequest request) {
    if (userJdbcRepository.isUserNotExist(request.getId())) {
      throw new IllegalArgumentException();
    }

    userJdbcRepository.updateUserName(request.getName(), request.getId());
  }

  public void deleteUser(String name) {
    if (userJdbcRepository.isUserNotExist(name)) {
      throw new IllegalArgumentException();
    }

    userJdbcRepository.deleteUser(name);
  }

}

