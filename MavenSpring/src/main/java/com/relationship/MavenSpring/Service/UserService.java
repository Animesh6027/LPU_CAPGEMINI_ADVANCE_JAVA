package com.relationship.MavenSpring.Service;

import java.util.List;

import com.relationship.MavenSpring.Model.User;

public interface UserService {
	List<User> getAllUser();
	User getUserById(long id);
	void addUser(User user);
}
