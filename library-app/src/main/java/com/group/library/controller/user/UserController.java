package com.group.library.controller.user;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.group.library.dto.user.request.UserCreateRequest;
import com.group.library.dto.user.request.UserUpdateRequest;
import com.group.library.dto.user.response.UserResponse;
import com.group.library.service.user.UserServiceV2;


@RestController
public class UserController {

	  private final UserServiceV2 userService;

	  public UserController(UserServiceV2 userService) {
	    this.userService = userService;
	  }

	  @PostMapping("/user") // POST /user
	  public void saveUser(@RequestBody UserCreateRequest request) {
	    userService.saveUser(request);
	  }

	  @GetMapping("/user")
	  public List<UserResponse> getUsers() {
	    return userService.getUsers();
	  }

	  @PutMapping("/user")
	  public void updateUser(@RequestBody UserUpdateRequest request) {
	    userService.updateUser(request);
	  }

	  @DeleteMapping("/user")
	  public void deleteUser(@RequestParam("name") String name) {
	    userService.deleteUser(name);
	  }

	}

