package com.example.user.service;

import com.example.user.model.User;
import com.example.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@RequiredArgsConstructor
class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @Test
    void getAll() {
        UserService userServiceImpl = new UserServiceImpl(userRepository);
        List<User> users = Arrays.asList(new User(1, "First", "first@mail.ru"));
        when(userRepository.findAll()).thenReturn(users);
        List<User> expectedUsers = userServiceImpl.getAll();
        assertEquals(expectedUsers, users);

        when(userRepository.findAll()).thenReturn(null);
        List<User> expectedUsersNull = userServiceImpl.getAll();
        assertNull(expectedUsersNull);
    }

    @Test
    void getUserById() {
    }

    @Test
    void getUserByLogin() {
    }

    @Test
    void getUserByEmail() {
    }

    @Test
    void create() {
    }
}