package cn.ljs.services;

import cn.ljs.javabean.Ec_shopcar;

public interface Ec_shopcarServices {
	
	public boolean insertShopCarRecord(Ec_shopcar shopcar);
	
	public Ec_shopcar findById(String id, String login_name);
	
	public Ec_shopcar findByIdAndLoginName(String id, String login_name);
	
	public boolean updateShopCarRecord(String buyNum, String id, String login_name);
	
	public boolean updateShopCarRecord2(String buyNum, String id, String login_name);
	
	public boolean deleteShopCarRecord(String id, String login_name);

}
