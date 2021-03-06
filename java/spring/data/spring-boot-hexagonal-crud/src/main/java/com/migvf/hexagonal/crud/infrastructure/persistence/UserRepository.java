package com.migvf.hexagonal.crud.infrastructure.persistence;

import com.migvf.hexagonal.crud.domain.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

    List<User> findByName(String name);
}
