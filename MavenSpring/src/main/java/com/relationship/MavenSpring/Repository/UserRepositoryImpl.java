package com.relationship.MavenSpring.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.relationship.MavenSpring.Model.User;

@Repository
public class UserRepositoryImpl implements UserRepository{
	private List<User> users = new ArrayList<User>();
	public UserRepositoryImpl() {
		users.add(new User(1L, "John Doe", "john@example.com"));
		users.add(new User(2L, "Jane Smith", "jane@example.com"));
		users.add(new User(3L, "Alex Charles", "charles@example.com"));
		users.add(new User(4L, "Stephan Strange", "itsStrange@example.com"));
	}

	@Override
	public List<User> findAll() {
		return users;
	}

	@Override
	public User findById(long id) {
		return users.stream()
				.filter(user -> user.getId().equals(id))
				.findFirst()
				.orElse(null);
	}

	@Override
	public void save(User user) {
		users.add(user);
		
	}
	
}
