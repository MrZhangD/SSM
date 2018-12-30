package pers.zhangdi.ssm.service;

import java.util.List;

import pers.zhangdi.ssm.vo.User;

public interface UserService {
	public User doSelectByUsername(String username);
	public boolean doUserLogin(User user);
	public List<User> doSelectAll();
	public void transferMoney(User user1,User user2 , int money);
}
