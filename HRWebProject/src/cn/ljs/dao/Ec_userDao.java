package cn.ljs.dao;

import cn.ljs.javabean.Ec_user;

public interface Ec_userDao {
	
	//�û�ע��
	public int reg_user(Ec_user user);
	
	//�û���¼
	public Ec_user findByUserName(Ec_user user);

}
