package pers.zhangdi.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.zhangdi.ssm.dao.UserMapper;
import pers.zhangdi.ssm.service.UserService;
import pers.zhangdi.ssm.vo.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper usermapper;
	
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
}
