package vn.iotstar.services;

import java.util.List;

import vn.iotstar.models.UserModel;

public interface IUserService {
	// Login
	UserModel login(String username, String password);
	UserModel FindByUserName(String username);
	
	// Register
	void insert(UserModel user);
	boolean register(String username, String password, String fullname, String email, String phone);
	boolean checkExistEmail(String email);
	boolean checkExistUsername(String username);
	boolean checkExistPhone(String phone);
	
	// New Pass
	void update(String password, String email);
	
	// Profile
	List<String> search(String username);
	
	// Update Profile
	void updateProfile(String username, String fullname, String phone, String images);
}
