package vn.iotstar.dao;

import java.util.List;

import vn.iotstar.models.UserModel;

public interface IUserDao {
	// Login
	List<UserModel> findAll();
	UserModel findById(int id);
	UserModel findByUserName(String username);
	
	// Register
	void insert(UserModel user);
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
