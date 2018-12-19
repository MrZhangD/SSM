package pers.zhangdi.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import pers.zhangdi.ssm.vo.User;

@Repository
public interface UserMapper {
	public User findByUsername(String username);
	public List<User> findAll();
}
