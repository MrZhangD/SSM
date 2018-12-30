package pers.zhangdi.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import pers.zhangdi.ssm.vo.User;

@Repository
public interface UserMapper {
	public User findByUsername(String username);
	public List<User> findAll();
	public boolean addMoney(@Param("user")User user , @Param("money") int money);
	public boolean reduceMoney(@Param("user") User user , @Param("money") int money);
}

