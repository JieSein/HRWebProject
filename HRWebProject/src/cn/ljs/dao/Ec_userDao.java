package cn.ljs.dao;

import cn.ljs.javabean.Ec_user;

public interface Ec_userDao {
	
	//用户注册
	public int reg_user(Ec_user user);
	
	//用户登录
	public Ec_user findByUserName(Ec_user user);

}
