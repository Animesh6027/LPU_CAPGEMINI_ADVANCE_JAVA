package com.relationship.MavenSpring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relationship.MavenSpring.Model.User;
import com.relationship.MavenSpring.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(long id) {
		return userRepository.findById(id);
	}

	@Override
	public void addUser(User user) {
		userRepository.save(user);
		
	}

}
