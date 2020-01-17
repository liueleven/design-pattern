package com.liuleven.designpattern.proxy.target;

public class UserServiceImpl implements UserService {

	@Override
	public void saveUser() {
		System.out.println("添加用户");
	}

	@Override
	public void delUser(int id) {
		System.out.println("删除用户");
	}
}
