package pers.zhangdi.ssm.service;

import java.util.List;

import pers.zhangdi.ssm.vo.User;

public interface UserService {
	public boolean doUserLogin(User user);
	public List<User> doSelectAll();
}
