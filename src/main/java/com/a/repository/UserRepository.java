package com.a.repository;


import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.a.domain.Countries;
import com.a.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

	@Query(value = "SELECT * FROM user_contry u WHERE u.country_code=:country_code", nativeQuery = true)
	public List<Object[]> user_jean(@Param("country_code") String name);
}