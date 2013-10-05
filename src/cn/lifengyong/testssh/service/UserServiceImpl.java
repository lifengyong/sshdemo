package cn.lifengyong.testssh.service;

import cn.lifengyong.entity.User;
import cn.lifengyong.testssh.dao.UserDAO;

public class UserServiceImpl implements UserService {
	private UserDAO userDAO;

	public boolean login(String name, String password) {
		User u = userDAO.queryUserByName(name);
		if (u == null) {
			return false;
		} else {
			if (u.getPassword().equals(password)) {
				return true;
			} else {
				return false;
			}
		}
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
