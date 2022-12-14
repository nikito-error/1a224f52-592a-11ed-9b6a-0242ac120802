package com.a.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.a.domain.Countries;
import com.a.domain.User;
import com.a.repository.UserRepository;


@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> list() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

	public List<Object[]> user_jean(String country_Code) {
		// TODO Auto-generated method stub
		return userRepository.user_jean(country_Code);
	}
   

}