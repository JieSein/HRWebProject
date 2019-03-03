package cn.ljs.services.impl;

import java.util.List;

import cn.ljs.dao.Ec_userDao;
import cn.ljs.dao.ShopCarOfUserDao;
import cn.ljs.dao.impl.Ec_userDaoImpl;
import cn.ljs.dao.impl.ShopCarOfUserDaoImpl;
import cn.ljs.javabean.Ec_user;
import cn.ljs.javabean.ShopCarOfUser;
import cn.ljs.services.ShopCarOfUserServices;

public class ShopCarOfUserServicesImpl implements ShopCarOfUserServices {
	
	private ShopCarOfUserDao shopCarOfUser = new ShopCarOfUserDaoImpl();

	@Override
	public List<ShopCarOfUser> findByLoginName(String login_name) {
		
		return shopCarOfUser.findByLoginName(login_name);
	}

	@Override
	public ShopCarOfUser findByIdAndLoginName(String id, String login_name) {
		ShopCarOfUserDao sDao = new ShopCarOfUserDaoImpl();
		ShopCarOfUser shopCarOfUser = sDao.findByIdAndLoginName(id, login_name);

		if (shopCarOfUser != null) {
			return shopCarOfUser;
		}else {
			return null;
		}
	}

}
