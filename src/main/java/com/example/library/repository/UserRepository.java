package com.example.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.library.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
