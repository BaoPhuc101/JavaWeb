package vn.iotstar.dao;

import java.util.List;

import vn.iotstar.models.UserModel;

public interface IUserDao {
	// Đăng nhập
	List<UserModel> findAll();
	UserModel findById(int id);
	UserModel findByUserName(String username);
	
	// Đăng ký
	void insert(UserModel user);
	boolean checkExistEmail(String email);
	boolean checkExistUsername(String username);
	boolean checkExistPhone(String phone);
	
	// Mật khẩu mới
	void update(String password, String email);
}
