package cn.ljs.services;

import cn.ljs.javabean.Ec_user;

public interface Ec_UserServices {
	
	//完成用户注册的方法
	public boolean registerUser(Ec_user user);
	
	//完成用户登录的方法
	public Ec_user findByUserName(Ec_user user);

}
