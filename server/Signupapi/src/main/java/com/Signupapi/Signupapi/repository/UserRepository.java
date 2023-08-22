package com.Signupapi.Signupapi.repository;

import com.Signupapi.Signupapi.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String> {
}