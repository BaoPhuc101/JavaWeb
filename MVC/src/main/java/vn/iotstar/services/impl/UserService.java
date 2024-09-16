package vn.iotstar.services.impl;

import vn.iotstar.dao.IUserDao;
import vn.iotstar.dao.impl.UserDaoImpl;
import vn.iotstar.models.UserModel;
import vn.iotstar.services.IUserService;

public class UserService implements IUserService {
	// Lấy toàn bộ hàm trong tầng DAO của User
	IUserDao userDao = new UserDaoImpl();

	@Override
	public UserModel login(String username, String password) {
		UserModel user = this.FindByUserName(username);
		if (user != null && password.equals(user.getPassword())) {
			return user;
		}
		return null;

	}

	@Override
	public UserModel FindByUserName(String username) {
		return userDao.findByUserName(username);
	}

	@Override
	public void insert(UserModel user) {
		userDao.insert(user);
	}

	@Override
	public boolean register(String username, String password, String fullname, String email, String phone) {
		if (userDao.checkExistUsername(username)) {
			return false;
		}
		long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
		userDao.insert(new UserModel(username, password, null, fullname, email, phone, 1, date));
		return true;
	}

	@Override
	public boolean checkExistEmail(String email) {
		return userDao.checkExistEmail(email);
	}

	@Override
	public boolean checkExistUsername(String username) {
		return userDao.checkExistUsername(username);
	}

	@Override
	public boolean checkExistPhone(String phone) {
		return userDao.checkExistPhone(phone);
	}

	public static void main(String[] args) {
		IUserService userService = new UserService();
		System.out.println(userService.register("Quang", "2024", "Nguyễn Trung Hiếu", "nth200@gmail.com", null));
		//System.out.println(userService.checkExistEmail("lhbaophuc0802@gmail.com"));
	}

	@Override
	public void update(String password, String email) {
		userDao.update(password, email);
		
	}
}
