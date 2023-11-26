package com.neoris.desafio.service;

import com.neoris.desafio.model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);
    User getUserByEmail(String email);
    User updateUser(String email, User user);
    User patchUpdateUser(String email);
    boolean deleteUserByEmail(String email);
    String createJwtToken(User user);
    List<User> listar();


}
