package pers.zhangdi.ssm.service.impl;

import java.util.List;

import org.apache.ibatis.jdbc.RuntimeSqlException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import pers.zhangdi.ssm.dao.UserMapper;
import pers.zhangdi.ssm.service.UserService;
import pers.zhangdi.ssm.vo.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper usermapper;

	public User doSelectByUsername(String username) {
		return usermapper.findByUsername(username);
	}

	public boolean doUserLogin(User user) {
		User u = usermapper.findByUsername(user.getUsername());
		if(u == null) {
			return false;
		}else {
			if(u.getPwd().equals(user.getPwd())) {
				return true;
			}else {
				return false;
			}
		}
	}

	public List<User> doSelectAll() {
		List<User> list = usermapper.findAll();
		return list;
	}

	@Transactional(rollbackFor=Exception.class)
	public void transferMoney(User user1 , User user2 , int money){
		//转账完成
		if(user1.getMoney() >= 0){
			usermapper.reduceMoney(user1,money);
			usermapper.addMoney(user2,money);
		}
		//再判断user1的余额是否足够，不足够则回滚
		if(user1.getMoney()-money <= 0){
			throw new RuntimeException("手动转账失败，所有数据回滚");
		}
	}
}
