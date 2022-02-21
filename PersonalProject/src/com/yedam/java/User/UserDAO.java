package com.yedam.java.User;

public interface UserDAO {

	public void insert(User user);
	
	
	public User selectOne(String id, String pw);
	
}
