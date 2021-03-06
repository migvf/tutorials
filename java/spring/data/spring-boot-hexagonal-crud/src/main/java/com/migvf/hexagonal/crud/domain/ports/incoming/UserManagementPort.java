package com.migvf.hexagonal.crud.domain.ports.incoming;

import com.migvf.hexagonal.crud.domain.entity.User;
import com.migvf.hexagonal.crud.domain.ports.exception.UserNotFoundException;

public interface UserManagementPort {

    User findById(long id) throws UserNotFoundException;
    User addUser(String name, String email);
    User updateUser(long id, String name, String email) throws UserNotFoundException;
    void deleteUser(long id) throws UserNotFoundException;
}
