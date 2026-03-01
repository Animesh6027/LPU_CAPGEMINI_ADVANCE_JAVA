package com.relationship.MavenSpring.Repository;

import java.util.List;

import com.relationship.MavenSpring.Model.User;

public interface UserRepository {
	List<User> findAll();
	User findById(long id);
	void save(User user);
}
