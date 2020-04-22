package com.migvf.hexagonal.crud.application.mapper;

import com.migvf.hexagonal.crud.application.dto.UserDto;
import com.migvf.hexagonal.crud.domain.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDto map(User user){
        return new UserDto(user.getId(), user.getName(), user.getEmail());
    }
}