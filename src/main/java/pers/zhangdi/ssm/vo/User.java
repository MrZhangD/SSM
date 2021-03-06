package pers.zhangdi.ssm.vo;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;

	private String name;

	private String pwd;

	private String sex;

	private String username;

	private int money;

	public User() {
	}

	public User(String username , String pwd) {
		this.username = username;
		this.pwd = pwd;
	}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public User(int id, String name, String pwd, String sex, String username, int money) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.sex = sex;
		this.username = username;
		this.money = money;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", pwd='" + pwd + '\'' +
				", sex='" + sex + '\'' +
				", username='" + username + '\'' +
				", money=" + money +
				'}';
	}
}