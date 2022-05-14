package com.example.user.rest;

import com.example.user.model.User;
import com.example.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
@RequiredArgsConstructor
public class UserRestController {
    private final UserService userServiceImpl;

    @GetMapping
    public List<User> getAll() {
        return userServiceImpl.getAll();
    }

    @GetMapping("/id")
    public User getUserById(@RequestParam("id") Integer id) {
        return userServiceImpl.getUserById(id);
    }

    @GetMapping("/login")
    public User getUserByLogin(@RequestParam("login") String login) {
        return userServiceImpl.getUserByLogin(login);
    }

    @GetMapping("/email")
    public User getUserByEmail(@RequestParam("email") String email) {
        return userServiceImpl.getUserByEmail(email);
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        return userServiceImpl.create(user);
    }
}
