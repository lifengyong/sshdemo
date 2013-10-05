package cn.lifengyong.testssh.dao;

import cn.lifengyong.entity.User;

public interface UserDAO {
	public User queryUserByName(String name);
}
