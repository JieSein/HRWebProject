package cn.ljs.services.impl;

import cn.ljs.dao.Ec_userDao;
import cn.ljs.dao.impl.Ec_userDaoImpl;
import cn.ljs.javabean.Ec_user;
import cn.ljs.services.Ec_UserServices;

public class Ec_UserServicesImpl implements Ec_UserServices {

	//����û�ע��ķ���
	@Override
	public boolean registerUser(Ec_user user) {
		Ec_userDao userDao = new Ec_userDaoImpl();
		int re = userDao.reg_user(user);
		
		if (re!=0) {
			return true;
		}else {
			return false;
		}
		
	}

	//�û���¼�ķ���
	@Override
	public Ec_user findByUserName(Ec_user user) {
		Ec_userDao userDao = new Ec_userDaoImpl();
		Ec_user users = userDao.findByUserName(user);

		if (users != null) {
			return users;
		}else {
			return null;
		}
		
	}

}
