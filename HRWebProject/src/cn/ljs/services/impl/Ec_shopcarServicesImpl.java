package cn.ljs.services.impl;

import cn.ljs.dao.Ec_shopcarDao;
import cn.ljs.dao.impl.Ec_shopcarDaoImpl;
import cn.ljs.javabean.Ec_shopcar;
import cn.ljs.services.Ec_shopcarServices;

public class Ec_shopcarServicesImpl implements Ec_shopcarServices {
	
	Ec_shopcarDao sDao= new Ec_shopcarDaoImpl();

	@Override
	public boolean insertShopCarRecord(Ec_shopcar shopcar) {
		int rs = sDao.insertShopCarRecord(shopcar);
		
		if (rs != 0) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public Ec_shopcar findById(String id, String login_name) {
		
		return sDao.findById(id, login_name);
		
	}
	
	@Override
	public Ec_shopcar findByIdAndLoginName(String id, String login_name) {
		return sDao.findByIdAndLoginName(id, login_name);
	}

	@Override
	public boolean updateShopCarRecord(String buyNum, String id, String login_name) {
		 
		int rs = sDao.updateShopCarRecord(buyNum, id, login_name);
		
		if (rs != 0) {
			return true;
		} else {
			return false;
		}
	
	}

	@Override
	public boolean updateShopCarRecord2(String buyNum, String id, String login_name) {
		int rs = sDao.updateShopCarRecord2(buyNum, id, login_name);
		
		if (rs != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean deleteShopCarRecord(String id, String login_name) {
		int rs = sDao.deleteShopCarRecord(id, login_name);
		
		if (rs != 0) {
			return true;
		} else {
			return false;
		}	}

}
