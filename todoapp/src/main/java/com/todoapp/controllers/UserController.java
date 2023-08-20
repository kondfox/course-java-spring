package com.todoapp.controllers;

import com.todoapp.models.dao.TodoUser;
import com.todoapp.models.dto.NewUser;
import com.todoapp.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

  private UserService userService;

  @GetMapping("/{id}")
  public ResponseEntity<TodoUser> getById(@PathVariable Integer id) {
    return ResponseEntity.status(OK).body(userService.getById(id));
  }

  @PostMapping
  public ResponseEntity<TodoUser> signUp(@RequestBody NewUser newUser) {
    return ResponseEntity.status(CREATED).body(userService.save(newUser));
  }

}
