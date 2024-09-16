package vn.iotstar.services;

import vn.iotstar.models.UserModel;

public interface IUserService {
	// Đăng nhập
	UserModel login(String username, String password);
	UserModel FindByUserName(String username);
	
	// Đăng ký
	void insert(UserModel user);
	boolean register(String username, String password, String fullname, String email, String phone);
	boolean checkExistEmail(String email);
	boolean checkExistUsername(String username);
	boolean checkExistPhone(String phone);
	
	// Mật khẩu mới
	void update(String password, String email);
}
