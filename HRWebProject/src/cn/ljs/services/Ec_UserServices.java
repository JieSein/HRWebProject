package cn.ljs.services;

import cn.ljs.javabean.Ec_user;

public interface Ec_UserServices {
	
	//����û�ע��ķ���
	public boolean registerUser(Ec_user user);
	
	//����û���¼�ķ���
	public Ec_user findByUserName(Ec_user user);

}
