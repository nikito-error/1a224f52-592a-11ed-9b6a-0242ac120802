package com.a.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.a.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}