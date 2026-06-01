package com.campus.users.user;

import java.util.Optional;

public interface UserService {
    UserEntity createUser(String username);
    Optional<UserEntity> findById(Long id);
}