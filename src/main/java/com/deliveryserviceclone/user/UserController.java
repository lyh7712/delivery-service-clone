package com.deliveryserviceclone.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/members")
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/register")
	public ResponseEntity<User> register(@Valid @RequestBody UserRegisterDto dto) {
		User user = dtoToUser(dto);
		userService.register(user);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	private User dtoToUser(UserRegisterDto dto) {
		return new User(dto.getEmail(), dto.getPassword());
	}
}
