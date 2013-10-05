package cn.lifengyong.testssh.action;

import cn.lifengyong.testssh.service.UserService;

public class LoginAction {
	private String name;
	private String password;
	private UserService userService;

	public String login() {
		// if (null == name && null == password) {
		// return "login";
		// } else if ("ssh".equals(name) && "12345".equals(password)) {
		// return "ok";
		// } else {
		// return "error";
		// }

		if (null == name && null == password) {
			return "login";
		} else {
			Boolean u = userService.login(name, password);
			if (u) {
				return "ok";
			} else {
				return "error";
			}
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
